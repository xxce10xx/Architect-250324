package com.architect.fitnessFunctions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;


public class FitnessTestJUnit {

	@Test
	public void number_of_classes_in_entities_package() {
	    JavaClasses entitiesClasses = new ClassFileImporter().importPackages("com.architect.fitnessFunctions.entities");
	    assertEquals(1, entitiesClasses.size());
	}
}
