/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universit� di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.resp.examples.disaster;

import java.awt.*;
import java.awt.geom.*;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Random;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.cmg.resp.comp.NodeConnection;
import org.cmg.resp.knowledge.AbstractActuator;
import org.cmg.resp.knowledge.AbstractSensor;
import org.cmg.resp.knowledge.ActualTemplateField;
import org.cmg.resp.knowledge.FormalTemplateField;
import org.cmg.resp.knowledge.Template;
import org.cmg.resp.knowledge.Tuple;


/**
 * @author loreti
 *
 */

public class Scenario extends Observable {
	
	public static final int LANDMARK = 0;
	public static final int WORKER = 1;
	protected static final double COMMUNICATION_RANGE = 100.0;

	private Random r = new Random();

	/**
	 * Array of robots: 
	 * - from 0 to numberOfExplorers-1 are explorers
	 * - from numberOfExplorers to numberOfExplorers+numberOfRescuers-1 are rescuers;
	 */
	private Robot[] robots;

	/**
	 * Arena width
	 */
	private double width;
	
	/**
	 * Arena height
	 */
	private double height;
	
	private Point2D.Double[] victims; 
	
	private Rectangle2D.Double nestLocation; // zona iniziale

	private int numberOfLandmarks;

	private int numberOfWorkers;

	private int numberOfVictims;
	
	private Polygon[] obstacles; // lista di ostacoli
	
	private int numberOfObstacles; // numero di ostacoli
	
	private Point2D.Double[] victimLocations; // possibili locazioni della vittima
	
	private LinkedList<Integer> landmarkList; // lista di landmark fermi

	public Scenario( int numberOfSeekers , int numberOfRescuers , int numberOfVictims , double height , double width ) {
		this.numberOfLandmarks = numberOfSeekers;
		this.numberOfWorkers = numberOfRescuers;
		this.numberOfVictims = numberOfVictims;
		this.height = height;
		this.width = width;
		this.victimLocations = new Point2D.Double[5]; // 5 locazioni possibili della vittima
		this.numberOfObstacles = 9; // 9 fissi nel nuovo scenario
		this.nestLocation = new Rectangle2D.Double(125,400,300,300); // Starting zone
		this.landmarkList = new LinkedList<Integer>(); // per progressive discovery
	}

	public void init() {
		this.obstacles = new Polygon[numberOfObstacles];
		obstacles[0] = new Polygon(new int[]{120,120,225,225,125,125}, new int[]{700,400,400,405,405,700}, 6); //muro in basso sx
		obstacles[1] = new Polygon(new int[]{430,430,325,325,425,425}, new int[]{700,400,400,405,405,700}, 6); //muro in basso dx
		obstacles[2] = new Polygon(new int[]{125,125,225,225,120,120}, new int[]{0,300,300,305,305,0}, 6); //muro in alto sx
		obstacles[3] = new Polygon(new int[]{425,425,325,325,430,430}, new int[]{0,300,300,305,305,0}, 6); //muro in alto dx
		obstacles[4] = new Polygon(new int[]{0,0,50,50}, new int[]{600,650,650,600}, 4); //ostacolo in basso a sx
		obstacles[5] = new Polygon(new int[]{0,0,50,50}, new int[]{100,200,200,100}, 4); //ostacolo in alto a sx
		obstacles[6] = new Polygon(new int[]{200,200,350,350}, new int[]{150,250,250,150}, 4); //ostacolo in alto al centro
		obstacles[7] = new Polygon(new int[]{500,500,550,550}, new int[]{225,325,325,225}, 4); //ostacolo in alto a dx
		obstacles[8] = new Polygon(new int[]{430,430,480,480}, new int[]{600,650,650,600}, 4); //ostacolo in basso a dx
		
		victimLocations[0] = new Point2D.Double(50,25); // in alto a sx
		victimLocations[1] = new Point2D.Double(500,25); // in alto a dx
		victimLocations[2] = new Point2D.Double(250,50); // in alto centro
		victimLocations[3] = new Point2D.Double(50,675); // in basso sx
		victimLocations[4] = new Point2D.Double(500,675); // in basso a dx
		
		this.victims = new Point2D.Double[numberOfVictims];
		for( int i=0 ; i<numberOfVictims ; i++ ) {
			int roll = this.r.nextInt(5); // Una delle possibili 5 locazioni a caso
			//this.victims[i] = victimLocations[roll];
			this.victims[i] = victimLocations[2];
		}
		robots = new Robot[numberOfLandmarks+numberOfWorkers];
		for( int i=0 ; i<numberOfLandmarks ; i++ ) {
			robots[i] = new Robot(i, 5);
			robots[i].setPosition( width-130-(this.r.nextDouble()*290)  , height-(this.r.nextDouble()*290)  );
		}
		for( int i=+numberOfLandmarks  ; i<numberOfLandmarks+numberOfWorkers ; i++ ) {
			robots[i] = new Robot(i, 5);
			robots[i].setPosition( width-210-(this.r.nextDouble()*90)  , height-290);//(this.r.nextDouble()*290)  );
		}
		
	}
	
	/**
	 * Returns the speed of the robot with index i
	 * 
	 * @param i robot index
	 * @return the speed of the robot with index i
	 */
	public double getSpeed(int i) {
		return robots[i].getSpeed();
	}

	/**
	 * Set the speed of the robot with index i
	 * 
	 * @param i robot index
	 * @param s robot speed
	 */
	public void setSpeed(int i,double s) {
		robots[i].setSpeed(s);
	}

	/**
	 * Returns current direction of robot with index i
	 * 
	 * @param i robot index
	 * @return direction of robot with index i
	 */
	public double getDirection(int i) {
		return robots[i].getDirection();
	}

	/**
	 * Set direction of robot with index i
	 * 
	 * @param i robot index
	 * @param d robot direction
	 */
	public void setDirection(int i,double d) {
		robots[i].setDirection(d);
	}
	
	/**
	 * Returns the position of robot  with index i
	 * 
	 * @param i robot index
	 * @return robot position
	 */
	public Point2D.Double getPosition( int i ) {
		return robots[i].getPosition();
	}
	
	/**
	 * Performs a simulation step. 
	 * 
	 * @param dt a simulation step in milliseconds.
	 * @throws Exception 
	 */
	public void step( double dt ) throws Exception {
		_updatePosition(dt);
		setChanged();
		notifyObservers();
	}

	/**
	 * Methods used to update position of robots.
	 *
	 * @param dt
	 * @throws Exception 
	 */
	private void _updatePosition(double dt) throws Exception {
//		System.out.println("Update positions...");
		for( int i=0 ; i<numberOfLandmarks+numberOfWorkers ; i++ ) {
			if (robots[i].walking) {
				Point2D.Double position = robots[i].getPosition();
				double x = position.getX()+((robots[i].getSpeed()*dt)*Math.cos(robots[i].getDirection()));
				double y = position.getY()+((robots[i].getSpeed()*dt)*Math.sin(robots[i].getDirection()));				
				if (x<0.0) {
					x=0.0;
				}
				if (y<0.0) {
					y=0.0;
				}
				if (x>width) {
					x=width;
				}
				if (y>height) {
					y=height;
				}
				int collisionNum=-1;
				int multisampleLevel = 8; // In quanti punti viene divisa la traiettoria
				Point2D.Double newpos = new Point2D.Double(x,y); // Nuova posizione del robot
				Point2D.Double[] multisampling = multisample (position, newpos, multisampleLevel); // Vettore multisampling
				for (int j=1; j<multisampleLevel; j++){ // Parte da 1, perch� 0 = pos attuale
					collisionNum = shapesContains(multisampling[j]);
					if (collisionNum>=0) { // Se � >=0 ci sono state collisioni
						robots[i].collision=true;
						robots[i].setPosition(multisampling[j-1]); // Ultima posizione senza collisioni
						break;
					}
				}
				if (collisionNum==-1) { // Se � -1 non ci sono state collisioni
					robots[i].collision=false;
					robots[i].setPosition(newpos);
				}
			}
		}
	}
	
	// Divide una retta in n punti.
	public Point2D.Double[] multisample (Point2D.Double a, Point2D.Double b, int n){
		Point2D.Double[] multi = new Point2D.Double[n]; // n = numero punti
		multi[0]=a; // inizz primo
		multi[n-1]=b; // inizz ultimo
		double offsetx = (b.x - a.x) / (n-1); // punti equidistanti quindi divido per n-1
		double offsety = (b.y - a.y) / (n-1); // e ad ogni iterazione lo aggiungo.
		for (int i=1; i<n-1; i++){
			multi[i]= new Point2D.Double (multi[i-1].x+offsetx , multi[i-1].y+offsety);
		}
		return multi;
	}
	
	// Controlla se un punto � dentro un ostacolo
	public int shapesContains (Point2D.Double p){
		int result=-1;
		for( int i=0 ; i<numberOfObstacles ; i++ ) { // per tutte le shape
			if (obstacles[i].contains(p))
				return i; // ritorna indice della figura
		}
		return result;
	}
	
	// Data una retta, controlla se interseca una figura dello scenario
	public Set<Point2D.Double> checkIntersection (Line2D.Double mov) throws Exception{
		Set<Point2D.Double> intersections = new HashSet<Point2D.Double>(); // lista di intersezioni
		for( int i=0 ; i<numberOfObstacles ; i++ ) { // per tutte le shape
			intersections.addAll(getIntersections (obstacles[i], mov)); // Addall, se ci sono piu figure intersecate
		}
		return intersections; // lista unica finale
	}
	
	// ** NON PIU' USATO **
	public Point2D.Double checkIntersection (Line2D.Double mov, int c) throws Exception{
		Set<Point2D.Double> intersections = new HashSet<Point2D.Double>(); // lista di intersezioni
		intersections=getIntersections (obstacles[c], mov);
		Iterator<Point2D.Double> it = intersections.iterator(); //iteratore
		if (it.hasNext()) {
			Point2D.Double nextP=it.next(); //inizializz
			return nextP;
		} else {
			System.out.println("Line: ("+mov.x1+","+mov.y1+"-"+mov.x2+","+mov.y2+")");
			System.out.println("Shape: "+c);
			System.out.println("Contains: "+obstacles[c].contains(mov.getP1()));
			System.exit(-1);
			return null;
		}
	}
	
	// Dato un poligono e un segmento, controlla se si intersecano
	 public Set<Point2D.Double> getIntersections(Polygon poly, Line2D.Double line) throws Exception {
	        PathIterator polyIt = poly.getPathIterator(null); // pathIterator
	        double[] coords = new double[6];
	        double[] firstCoords = new double[2];
	        double[] lastCoords = new double[2];
	        Set<Point2D.Double> intersections = new HashSet<Point2D.Double>(); // Lista di inters
	        polyIt.currentSegment(firstCoords); // inserisce su firstCoords le prime coordinate
	        lastCoords[0] = firstCoords[0];
	        lastCoords[1] = firstCoords[1];
	        polyIt.next();
	        while(!polyIt.isDone()) {
	            int type = polyIt.currentSegment(coords);
	            switch(type) {
	                case PathIterator.SEG_LINETO : {
	                    Line2D.Double currentLine = new Line2D.Double(lastCoords[0], lastCoords[1], coords[0], coords[1]);
	                    if(currentLine.intersectsLine(line)){
	                        intersections.add(getIntersection(currentLine, line));}
	                    lastCoords[0] = coords[0];
	                    lastCoords[1] = coords[1];
	                    break;
	                }
	                case PathIterator.SEG_CLOSE : {
	                    Line2D.Double currentLine = new Line2D.Double(coords[0], coords[1], firstCoords[0], firstCoords[1]);
	                    if(currentLine.intersectsLine(line)){
	                        intersections.add(getIntersection(currentLine, line));}
	                    break;
	                }
	                default : {
	                    throw new Exception("Unsupported PathIterator segment type.");
	                }
	            }
	            polyIt.next();
	        }
	        return intersections;
	    }

	    // Dati due segmenti, restituisce il punto di intersezione
	    public Point2D.Double getIntersection(Line2D.Double line1, Line2D.Double line2) {
	        double x1,y1, x2,y2, x3,y3, x4,y4;
	        x1 = line1.x1; y1 = line1.y1; x2 = line1.x2; y2 = line1.y2;
	        x3 = line2.x1; y3 = line2.y1; x4 = line2.x2; y4 = line2.y2;
	        double x = ( (x2 - x1)*(x3*y4 - x4*y3) - (x4 - x3)*(x1*y2 - x2*y1))
	        		 / ( (x1 - x2)*(y3 - y4) - (y1 - y2)*(x3 - x4) );
	        double y = ( (y3 - y4)*(x1*y2 - x2*y1) - (y1 - y2)*(x3*y4 - x4*y3))
	        		 / ( (x1 - x2)*(y3 - y4) - (y1 - y2)*(x3 - x4) );
	        return new Point2D.Double(x, y);
	    }

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public AbstractActuator getDirectionActuator(final int i) {
		return new AbstractActuator("direction") {
			
			@Override
			public void send(Tuple t) {
				double dir = t.getElementAt(Double.class, 1);
				setDirection(i, dir);
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("direction") ,
						new FormalTemplateField(Double.class)
				);
			}
		};
	}

	public AbstractActuator getStopActuator(final int i) {
		return new AbstractActuator("stop") {
			
			@Override
			public void send(Tuple t) {
				stop( i );
			}
			
			@Override
			public Template getTemplate() {
				return new Template(
						new ActualTemplateField("stop")
				);
			}
		};
	}

	protected void stop(int i) {
		robots[i].stop();
	}

	public AbstractSensor getVictimSensor(final int i) {
		return robots[i].getVictimSensor();
	}
	
	public AbstractSensor getNestSensor(final int i) {
		return robots[i].getNestSensor();
	}

	public AbstractSensor getCollisionSensor(final int i) {
		return robots[i].getCollisionSensor();
	}
	
	public AbstractSensor getDistanceSensor(final int i) {
		return robots[i].getDistanceSensor();
	}


	public class Robot {
		
		private boolean collision; // true se c'� stata una collisione
		
		private static final double VICTIM_SENSOR_RANGE = 15;

		private int i;
		
		private double direction;
		
		private Point2D.Double position;
		
		private double speed;
		
		private boolean walking;
		
		private AbstractSensor victimSensor;
		
		private AbstractSensor nestSensor;
		
		private AbstractSensor distanceSensor;
		
		private AbstractSensor collisionSensor;
		
		public Robot( int i , double speed ) {
			this.i = i;
			this.walking = false;
			this.speed = speed;
			this.victimSensor = new AbstractSensor("VictimSensor-"+i ,
					new Template( new ActualTemplateField("VICTIM_PERCEIVED") , new FormalTemplateField(Boolean.class) )) {
			};
			this.nestSensor = new AbstractSensor("NestSensor-"+i ,
					new Template( new ActualTemplateField("OUTOFNEST") , new FormalTemplateField(Boolean.class) )) {
			};
			
			this.distanceSensor = new AbstractSensor("DistanceSensor-"+i ,
					new Template( new ActualTemplateField("NOLANDMARSKNEAR") , new FormalTemplateField(Boolean.class) )) {
			};
			
			this.collisionSensor = new AbstractSensor("CollisionSensor-"+i,
					new Template( new ActualTemplateField("COLLISION") , new FormalTemplateField(Boolean.class) )) {
			};
			updateCollisionSensor();
			updateVictimSensor();
			updateNestSensor();
			updateDistanceSensor();
		}
		
		public boolean OutOfNest(){ // se un robot NON � dentro la starting zone
			if (this.position != null) {
			return !(122<position.x && position.x<427 && 400<=position.y && position.y<=700);
			}
			return false;
		}
		
		public boolean nearLandmark (){ // true se ha un landmark "vicino" , false altrimenti.
			try{
				if (position != null){
					if (landmarkList.isEmpty()) return false; // lista vuota = il primo che esce dal nest.
					Iterator<Integer> it = landmarkList.iterator();
					while (it.hasNext()) { // controllo tutta la lista con l'iteratore
						int n = it.next();
						Point2D.Double p = robots[n].getPosition();
						double d = p.distance(this.position);
						if (d < 95) { // prova distanza < 95 (con connection range = 100)
							Line2D.Double visual = new Line2D.Double (position, p); // segmento tra i 2 robots
							if (checkIntersection(visual).isEmpty() ) return true; // nessun ostacolo tra i due
						}
					}
				}
				return false;
			} catch (Exception e) {
				return false;
			}
		}
		
		public void stop() {
			this.walking = false;
		}
		
		public AbstractSensor getNestSensor() {
			return nestSensor;
		}
		
		public AbstractSensor getDistanceSensor() {
			return distanceSensor;
		}

		public AbstractSensor getVictimSensor() {
			return victimSensor;
		}

		public AbstractSensor getCollisionSensor() {
			return collisionSensor;
		}

		public synchronized void setDirection(double d) {
			this.direction = d;
			this.walking = true;
		}

		public double getDirection() {
			return direction;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getSpeed() {
			return speed;
		}

		public void setPosition( double x , double y ) {
			setPosition( new Point2D.Double(x,y));
		}
		
		public void setPosition( Point2D.Double point ) {
			position = point;
			updateCollisionSensor();
			updateVictimSensor();
			updateNestSensor();
			updateDistanceSensor();
		}
		
		
		public boolean detectVictim() {
			if (position != null) {
				for (Point2D.Double p : victims) {
					if (p.distance(this.position) <= VICTIM_SENSOR_RANGE) {
						return true;
					}
				}
			}
			return false;
		}
		
		
		private void updateVictimSensor() {
			victimSensor.setValue( new Tuple("VICTIM_PERCEIVED" , detectVictim() ));
		}
		
		private void updateNestSensor() {
			nestSensor.setValue( new Tuple("OUTOFNEST" ,  OutOfNest() ));
		} 

		private void updateDistanceSensor() {
			distanceSensor.setValue( new Tuple("NOLANDMARSKNEAR" , !nearLandmark() ));
		}
		
		private void updateCollisionSensor() {
			if ((position != null)&&((position.x <= 0)||(position.x>=width)||(position.y<=0)||(position.y>=height)||collision)) {
				collisionSensor.setValue( new Tuple( "COLLISION" , true ) );
				walking = false; 
			} else {
				collisionSensor.setValue( new Tuple( "COLLISION" , false ));
			}
		}

		public Point2D.Double getPosition() {
			return position;			
		}
				
	}


	public int getSize() {
		return numberOfLandmarks+numberOfWorkers;
	}

	public Color getColor(int i) {
		return Color.BLACK;
	}

	public int getLandmarks() {
		return numberOfLandmarks;
	}

	public int getWorkers() {
		return numberOfWorkers;
	}

	public int getVictims() {
		return numberOfVictims;
	}

	public Point2D.Double getVictimPosition(int i) {
		return victims[i];
	}

	public NodeConnection getNodeConnection() {
		return new NodeConnection() {
			
			@Override
			public void waitInTouch(String src, String target)
					throws InterruptedException {
				// TODO Auto-generated method stub
			}
			
			@Override
			public boolean areInTouch(String src, String target) {		
				try {
					int idSrc = Integer.parseInt(src);
					int idTrg = Integer.parseInt(target);
					Point2D.Double locationSrc = robots[idSrc].getPosition();
					Point2D.Double locationTarget = robots[idTrg].getPosition();
					if ((locationSrc==null)||(locationTarget==null)) {
						return false;
					}
					Line2D.Double mov = new Line2D.Double (locationSrc, locationTarget);
					if (!checkIntersection(mov).isEmpty() ) return false; //ostacolo tra i due
					return locationSrc.distance(locationTarget)<COMMUNICATION_RANGE;
				} catch (Exception e) {
					return false;
				}
			}
		};
	}
	
	public void addLandmarkList(int a){
		landmarkList.add(a);
	}
	
	public int LandmarkListSize(){
		return landmarkList.size();
	}
	
	public Rectangle2D.Double getNest(){
		return nestLocation;
	}

	public int getNumberOfLandmarks() {
		return numberOfLandmarks;
	}
	
	public Polygon getObstacles(int i){
		return obstacles[i];
	}

	public int getNumberOfObstacles(){
		return numberOfObstacles;
	}
	
	public boolean goalReached() {
		for ( int i=numberOfLandmarks ; i<numberOfLandmarks+numberOfWorkers ; i++ ) {
			if (robots[i].detectVictim()) {
				return true;
			}
		} 
		return false;
	}
	
}