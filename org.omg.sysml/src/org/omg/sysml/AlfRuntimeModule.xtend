/*
 * generated by Xtext 2.12.0
 */
package org.omg.sysml

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.omg.sysml.scoping.AlfQualifiedNameConverter

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AlfRuntimeModule extends AbstractAlfRuntimeModule {
	
	def Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		AlfQualifiedNameConverter
	}
		
}
