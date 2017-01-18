package dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import domain.EnumerationValue;


public class EnumerationValueRepositoryCRUDTest {

	@Test
	public void testAdd() throws SQLException {
		Connection connection = DriverManager.getConnection(""
				+ "jdbc:hsqldb:hsql://localhost/workdb");
		
		IRepositoryCatalog catalogOf = new RepositoryCatalog(connection);
		EnumerationValue crudTest = new EnumerationValue();
		crudTest.setIntKey(30);
		crudTest.setStringKey("VIP");
		crudTest.setValue("very important person");
		crudTest.setEnumerationName("permission");
		catalogOf.enumerations().add(crudTest);
		catalogOf.saveAndClose();
		
	}

}
