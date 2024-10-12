package studentRegistration;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import Controller.StudentController;
import model.Student;

public class TestForStudent {
	
	private StudentController studentController;
	
	 @Before
	    public void setUp() {
	        studentController = new StudentController();
	    }

    @Test
    public void test() {
    	 // Create a new student object without a registration number
        Student student = new Student("Aline", "1995-05-01");

        // Save the student and assert the response
        String result = studentController.saveStudent(student);
        assertEquals("Student saved successfully", result);
    }

}
