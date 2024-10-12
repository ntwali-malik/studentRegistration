package studentRegistration;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Controller.StudentController;
import model.Student;

public class TestForStudent {

    @Test
    public void test() {
        StudentController studentController = new StudentController();
        // Correct constructor call
        Student student = new Student("123", "Malik", "2022-10-01"); 
        
        assertEquals("Saved", studentController.saveStudent(student));
        // Remove the fail statement as it's just for placeholder
        // fail("Not yet implemented");  
    }

}
