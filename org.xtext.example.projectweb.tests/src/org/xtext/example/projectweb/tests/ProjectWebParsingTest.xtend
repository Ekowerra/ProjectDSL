/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.projectweb.projectWeb.programWeb

@RunWith(XtextRunner)
@InjectWith(ProjectWebInjectorProvider)
class ProjectWebParsingTest{

	@Inject
	ParseHelper<programWeb> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
