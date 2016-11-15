/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.projectweb.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.projectweb.projectWeb.ProjectWebPackage;
import org.xtext.example.projectweb.projectWeb.programWeb;
import org.xtext.example.projectweb.services.ProjectWebGrammarAccess;

@SuppressWarnings("all")
public class ProjectWebSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProjectWebGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProjectWebPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProjectWebPackage.PROGRAM_WEB:
				sequence_programWeb(context, (programWeb) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     programWeb returns programWeb
	 *
	 * Constraint:
	 *     (
	 *         declarations+=Declaration* 
	 *         nav=WithNav 
	 *         goto=Goto 
	 *         if=If* 
	 *         fonction=Fonction* 
	 *         proc=Proc*
	 *     )
	 */
	protected void sequence_programWeb(ISerializationContext context, programWeb semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}