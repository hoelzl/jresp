/*
 * generated by Xtext
 */
package org.cmg.resp.xtext.scellight.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.cmg.resp.xtext.scellight.ui.internal.ScelLightActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ScelLightExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ScelLightActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ScelLightActivator.getInstance().getInjector(ScelLightActivator.ORG_CMG_RESP_XTEXT_SCELLIGHT_SCELLIGHT);
	}
	
}
