/**
 * Copyright (c) 2012 Concurrency and Mobility Group.
 * Universitˆ di Firenze
 *	
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Michele Loreti
 */
package org.cmg.scel.knowledge;

/**
 * @author Michele Loreti
 *
 */
public abstract class SCELValue {
	
	public enum SCELType {
		BOOLEAN,
		BYTE,
		CHAR,
		DOUBLE,
		FLOAT,
		INT,
		LONG,
		SHORT,
		STRING,
		TAG;		
	}
	
	private SCELType type;
	
	public SCELValue( SCELType type ) {
		this.type = type;
	}
	
	public SCELType getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SCELValue) {
			return type==((SCELValue) obj).type;
		}
		return false;
	}
	
	public static class SCELInteger extends SCELValue {
		
		private int value;
		
		public SCELInteger( int value ) {
			super(SCELType.INT);
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELInteger) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return value;
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
		
		
		
	}

	public static class SCELBoolean extends SCELValue {
		
		private boolean value;
		
		public SCELBoolean( boolean value ) {
			super(SCELType.BOOLEAN);
			this.value = value;
		}
		
		public boolean getValue() {
			return value;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELBoolean) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (value?1:0);
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
	}
	
	public static class SCELByte extends SCELValue {
		
		private byte value;
		
		public SCELByte( byte value ) {
			super(SCELType.BYTE);
			this.value = value;
		}
		
		public byte getValue() {
			return value;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELByte) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return value;
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
	}

	public static class SCELChar extends SCELValue {
		
		private char value;
		
		public SCELChar( char value ) {
			super(SCELType.CHAR);
			this.value = value;
		}
		
		public char getValue() {
			return value;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELChar) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return value;
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
		
	}

	public static class SCELLong extends SCELValue {
		
		private long value;
		
		public SCELLong( long value ) {
			super(SCELType.LONG);
			this.value = value;
		}
		
		public long getValue() {
			return value;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELLong) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (int) value;
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
	}
	
	public static class SCELFloat extends SCELValue {
		
		private float value;
		
		public SCELFloat( float value ) {
			super(SCELType.FLOAT);
			this.value = value;
		}
		
		public float getValue() {
			return value;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELFloat) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (int) value;
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
		
	}

	public static class SCELDouble extends SCELValue {
		
		private double value;
		
		public SCELDouble( double value ) {
			super(SCELType.DOUBLE);
			this.value = value;
		}
		
		public double getValue() {
			return value;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELDouble) obj).value;
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (int) value;
		}

		@Override
		public java.lang.String toString() {
			return value+"";
		}
		
	}

	public static class SCELTag extends SCELValue {
		
		private String tagName;
		private Tuple elements;
		
		public SCELTag( String tagName , Tuple elements ) {
			super(SCELType.TAG);
			this.tagName = tagName;
			this.elements = elements;
		}
		
		public String getTagName() {
			return tagName;
		}
		
		public Tuple getElements() {
			return elements;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return tagName.equals(((SCELTag) obj).tagName)&&elements.equals(((SCELTag) obj).elements);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return tagName.hashCode()^elements.hashCode();
		}

		@Override
		public java.lang.String toString() {
			return tagName+elements.toString();
		}
		
	}

	public static class SCELString extends SCELValue {
		
		private String value;
		
		public SCELString( String value ) {
			super(SCELType.STRING);
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value.equals(((SCELString) obj).value);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}

		@Override
		public java.lang.String toString() {
			return value;
		}
		
	}

	public static class SCELShort extends SCELValue {
		
		private short value;
		
		public SCELShort( short value ) {
			super(SCELType.BYTE);
			this.value = value;
		}
		
		public short getValue() {
			return value;
		}
		
	
		@Override
		public boolean equals(Object obj) {
			if (super.equals(obj)) {
				return value == ((SCELByte) obj).value;
			}
			return false;
		}
	
		@Override
		public int hashCode() {
			return value;
		}
	
		@Override
		public java.lang.String toString() {
			return value+"";
		}
	}
	
	public static SCELBoolean getBoolean( boolean b ) {
		return new SCELBoolean(b);
	}

	public static SCELByte getByte( byte b ) {
		return new SCELByte(b);
	}

	public static SCELChar getChar( char c ) {
		return new SCELChar(c);
	}

	public static SCELShort getShort( short i ) {
		return new SCELShort(i);
	}
	
	public static SCELInteger getInteger( int i ) {
		return new SCELInteger(i);
	}
	
	public static SCELLong getLong( long l ) {
		return new SCELLong(l);
	}
	
	public static SCELFloat getFloat( float f ) {
		return new SCELFloat(f);
	}
	
	public static SCELDouble getDouble( double d ) {
		return new SCELDouble(d);
	}

	public static SCELString getString( String s ) {
		return new SCELString(s);
	}

	
	public static SCELTag getTag( String name , Tuple elements ) {
		return new SCELTag(name, elements);
	}

}
