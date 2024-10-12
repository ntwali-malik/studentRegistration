package studentRegistration;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.ConnectionController;
import Util.HibernateUtil;

public class DatabaseConnectionTest {

	@Test
	public void test() {
		ConnectionController connection = new ConnectionController();
		assertNotNull(connection.establishConnection());
		
	}

}
