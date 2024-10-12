package Controller;

import org.hibernate.Session;

import Util.HibernateUtil;

public class ConnectionController {

	
	public String establishConnection(){
		try(Session session = HibernateUtil.getSession().openSession()) {
			
			return "Connected";
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
