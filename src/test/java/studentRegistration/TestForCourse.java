package studentRegistration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.CourseController;
import model.AcademicUnit;
import model.Course;
import model.CourseDefinition;
import model.EAcademicUnit;

public class TestForCourse {
	
	private CourseController courseController;

    @Before
    public void setUp() {
        courseController = new CourseController();
    }

	@Test
	public void test() {
		 // Create a new CourseDefinition object
        CourseDefinition courseDefinition = new CourseDefinition();
        courseDefinition.setCode("CS102");
        courseDefinition.setName("Introduction to Computer Science");
        courseDefinition.setDescription("A foundational course in computer science.");
        
        // Save the CourseDefinition first
        // You can call the CourseDefinitionController to save it
        // Example: new CourseDefinitionController().saveCourseDefinition(courseDefinition);

        // Create a new AcademicUnit object
        AcademicUnit academicUnit = new AcademicUnit();
        academicUnit.setCode("CS");
        academicUnit.setName("Computer Science");
        academicUnit.setAcademicUnitType(EAcademicUnit.DEPARTMENT);
        // Save the AcademicUnit first
        // Example: new AcademicUnitController().saveAcademicUnit(academicUnit);
        
        // Create a new Course object
        Course course = new Course();
        course.setCode("CS101");
        course.setName("Introduction to Computer Science");
        course.setDescription("An introductory course on computer science principles.");
        course.setCourseDefinition(courseDefinition); // Set the CourseDefinition
        course.setAcademicUnit(academicUnit); // Set the AcademicUnit

        // Save the course and assert the response
        String result = courseController.saveCourse(course);
        assertEquals("Course saved successfully", result);
	}

}
