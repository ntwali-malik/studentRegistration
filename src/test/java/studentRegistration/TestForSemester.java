package studentRegistration;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import Controller.SemesterController;
import model.Semester;

public class TestForSemester {
	
	private SemesterController semesterController;

    @Before
    public void setUp() {
        semesterController = new SemesterController();
    }

	@Test
	public void test() {
		 // Create a new Semester object
        Semester semester = new Semester();
        semester.setName("Fall 2024");
        semester.setStartDate(LocalDate.of(2024, 9, 1));
        semester.setEndDate(LocalDate.of(2024, 12, 15));

        // Save the semester and assert the response
        String result = semesterController.saveSemester(semester);
        assertEquals("Semester saved successfully", result);
	}

}
