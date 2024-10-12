package Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import model.AcademicUnit;

public class AcademicUnitController {

	// Save an Academic Unit
    public String saveAcademicUnit(AcademicUnit academicUnit) {
        try (Session session = HibernateUtil.getSession().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(academicUnit);
            transaction.commit();
            return "Academic Unit saved successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Failed to save Academic Unit";
        }
    }
}
