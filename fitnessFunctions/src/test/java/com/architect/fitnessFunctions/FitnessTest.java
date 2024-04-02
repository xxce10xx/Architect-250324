package com.architect.fitnessFunctions;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.library.Architectures.*;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;
import com.architect.fitnessFunctions.repository.EmployeeRepository;
import com.architect.fitnessFunctions.utils.ExampleUtils;

@AnalyzeClasses(packages = "com.architect.fitnessFunctions")
public class FitnessTest {
	
//	@ArchTest
//	public static final ArchRule ruleController_Repository = classes().that().resideInAPackage("..repository..")
//			.should().onlyHaveDependentClassesThat().resideInAnyPackage("..controllers..");

	
//	@ArchTest
//	public static final ArchRule rulePatternControllers = classes().that().haveNameMatching(".*Controller")
//			.should().resideInAPackage("com.architect.fitnessFunctions.controllers");
	
//	@ArchTest
//	public static final ArchRule ruleNamaImpl = classes().that().implement(ExampleUtils.class)
//			.should().haveSimpleNameEndingWith("String");
	
//	@ArchTest
//	public static final ArchRule ruleDependEntity = noClasses().that().resideInAPackage("..entities..")
//		    .should().dependOnClassesThat().resideInAPackage("..controllers..");
	
//	@ArchTest
//	public static final ArchRule ruleAnnotation = classes().that().areAssignableTo(EmployeeRepository.class)
//		    .should().onlyHaveDependentClassesThat().areAnnotatedWith(RestController.class);
	
//	@ArchTest
//	public static final ArchRule ruleLayers = layeredArchitecture()
//		    .consideringAllDependencies()
//		    .layer("Controller").definedBy("..controller..")
//		    .layer("repository").definedBy("..repository..")
//
//		    .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
//		    .whereLayer("repository").mayOnlyBeAccessedByLayers("Controller");
//	
	@Nested
	class OtherTest {
		
		@Test
		public void number_of_classes_in_configuration_package() {
		    JavaClasses importedClasses = new ClassFileImporter().importPackages("com.architect.fitnessFunctions.configurations");
		    assertEquals(1, importedClasses.size());
		}
	}
}
