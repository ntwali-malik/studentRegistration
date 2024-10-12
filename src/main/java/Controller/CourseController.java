package Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import model.Course;

public class CourseController {

	// Save a Course
    public String saveCourse(Course course) {
        try (Session session = HibernateUtil.getSession().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(course);
            transaction.commit();
            return "Course saved successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Failed to save Course";
        }
    }
}
