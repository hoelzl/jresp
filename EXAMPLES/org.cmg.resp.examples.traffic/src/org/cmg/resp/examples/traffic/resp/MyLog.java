package org.cmg.resp.examples.traffic.resp;


/**
 * Log for current project.
 * 
 * @author Tommaso Zoppi
 *
 */

public class MyLog {
	
	public static void debug(String message){
		System.out.println("[DEBUG] " +  message);
	}
	
	public static void error(String message){
		System.err.println("[ERROR] " +  message);
	}
}
