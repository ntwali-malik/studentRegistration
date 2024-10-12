package Util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import model.AcademicUnit;
import model.Course;
import model.CourseDefinition;
import model.Semester;
import model.Student;
import model.StudentRegistration;
import model.Teacher;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSession() {
		if(sessionFactory == null) {
		Configuration configuration = new Configuration();
		Properties property = new Properties();
		property.put(Environment.URL, "jdbc:postgresql://localhost:5432/auca");
		property.put(Environment.USER, "postgres");
		property.put(Environment.PASS, "123");
		property.put(Environment.SHOW_SQL, "true");
		property.put(Environment.HBM2DDL_AUTO, "update");
		
		configuration.addProperties(property);
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Course.class);
		configuration.addAnnotatedClass(Semester.class);
		configuration.addAnnotatedClass(AcademicUnit.class);
		configuration.addAnnotatedClass(Teacher.class);
		configuration.addAnnotatedClass(CourseDefinition.class);
		configuration.addAnnotatedClass(StudentRegistration.class);
		
		sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
		}
		else {
			return sessionFactory;
		}
	}
}
