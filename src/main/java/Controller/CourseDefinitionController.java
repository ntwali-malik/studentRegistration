package Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import model.CourseDefinition;

public class CourseDefinitionController {

	 // Save a CourseDefinition
    public String saveCourseDefinition(CourseDefinition courseDefinition) {
        try (Session session = HibernateUtil.getSession().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(courseDefinition);
            transaction.commit();
            return "Course Definition saved successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Failed to save Course Definition";
        }
    }

}
