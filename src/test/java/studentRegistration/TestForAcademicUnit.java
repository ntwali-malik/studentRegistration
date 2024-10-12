package studentRegistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.AcademicUnitController;
import model.AcademicUnit;
import model.EAcademicUnit;

public class TestForAcademicUnit {
	
	private AcademicUnitController academicUnitController;
	
	 @Before
	    public void setUp() {
	        academicUnitController = new AcademicUnitController();
	    }

	@Test
	public void test() {
		// Create a new Parent AcademicUnit object
	    AcademicUnit parentUnit = new AcademicUnit();
	    parentUnit.setCode("ENG");
	    parentUnit.setName("Engineering");
	    parentUnit.setAcademicUnitType(EAcademicUnit.FACULTY);

	    // Save the parent unit first
	    academicUnitController.saveAcademicUnit(parentUnit);

	    // Create a new Child AcademicUnit object
	    AcademicUnit academicUnit = new AcademicUnit();
	    academicUnit.setCode("CS");
	    academicUnit.setName("Computer Science");
	    academicUnit.setAcademicUnitType(EAcademicUnit.DEPARTMENT); // Set the unit type

	    // Set parent unit (now that it's saved)
	    academicUnit.setParentId(parentUnit);

	    // Save the academic unit and assert the response
	    String result = academicUnitController.saveAcademicUnit(academicUnit);
	    assertEquals("Academic Unit saved successfully", result);
        
	}

}
