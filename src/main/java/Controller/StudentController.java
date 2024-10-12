package Controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;
import model.Student;

public class StudentController {
	
	public String saveStudent(Student student) {
		try (Session session = HibernateUtil.getSession().openSession()){
			Transaction transaction = null;
			transaction = session.beginTransaction();
			session.persist(student);
			session.close();
			return "Saved Succe";
		}catch(Exception ex) {
			ex.printStackTrace();
			return "Not Saved";
		}
	}

}
