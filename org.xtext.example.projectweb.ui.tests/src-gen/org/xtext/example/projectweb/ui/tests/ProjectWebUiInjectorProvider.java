/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.example.projectweb.ui.internal.ProjectwebActivator;

public class ProjectWebUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ProjectwebActivator.getInstance().getInjector("org.xtext.example.projectweb.ProjectWeb");
	}

}
