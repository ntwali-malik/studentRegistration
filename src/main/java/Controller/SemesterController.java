package Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import model.Semester;

public class SemesterController {

	// Save a Semester
    public String saveSemester(Semester semester) {
        try (Session session = HibernateUtil.getSession().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(semester);
            transaction.commit();
            return "Semester saved successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Failed to save Semester";
        }
    }
}
