/*
* generated by Xtext
*/
package org.cmg.resp.xtext.hlscel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HLScelStandaloneSetup extends HLScelStandaloneSetupGenerated{

	public static void doSetup() {
		new HLScelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

