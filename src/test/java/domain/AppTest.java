package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.EnumerationValue;
import domain.RolesPermissions;
import domain.User;
import domain.UserRoles;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import dao.IRepositoryCatalog;
import dao.RepositoryCatalog;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws SQLException 
     */
	public void test () throws SQLException{
		
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb" );
		IRepositoryCatalog catalogOf = new RepositoryCatalog(connection);
		
		
		///*	//insert
		EnumerationValue tescik1 = new EnumerationValue();
		tescik1.setIntKey(1);
		tescik1.setStringKey("teststringkey");
		tescik1.setValue("testvalue");
		tescik1.setEnumerationName("testenumname");
		catalogOf.enumerations().add(tescik1);
		catalogOf.saveAndClose();
		//*/
		
		/*	//insert
		User tescik2 = new User();
		tescik2.setLogin("log");
		tescik2.setPassword("pas");			
		catalogOf.users().add(tescik2);
		catalogOf.saveAndClose();
		//*/

		/*	//delete
		User tescik3 = new User();
		tescik3.setId(2);
		catalogOf.users().delete(tescik3);
		catalogOf.saveAndClose();
		*/
	
		/*	//select	
		EnumerationValue tescik4 =  catalogOf.enumerations().get(1);
		System.out.println(tescik4.getStringKey());
		catalogOf.saveAndClose();
		*/
		
		/*	//update
		User tescik5 = new User();	
		tescik5.setId(1);
		tescik5.setLogin("new2 login");
		tescik5.setPassword("new2 pass");		
		catalogOf.users().update(tescik5);
		catalogOf.saveAndClose();
		*/
		
}
	
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}