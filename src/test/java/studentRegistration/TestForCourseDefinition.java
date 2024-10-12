package studentRegistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.CourseDefinitionController;
import model.CourseDefinition;

public class TestForCourseDefinition {
	
	private CourseDefinitionController courseDefinitionController;

    @Before
    public void setUp() {
        courseDefinitionController = new CourseDefinitionController();
    }

	@Test
	public void test() {
		// Create a new CourseDefinition object
        CourseDefinition courseDefinition = new CourseDefinition();
        courseDefinition.setCode("CS101");
        courseDefinition.setName("Introduction to Computer Science");
        courseDefinition.setDescription("A foundational course in computer science.");

        // Save the course definition and assert the response
        String result = courseDefinitionController.saveCourseDefinition(courseDefinition);
        assertEquals("Course Definition saved successfully", result);
	}

}
