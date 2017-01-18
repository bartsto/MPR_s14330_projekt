package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.IRepositoryCatalog;
import dao.EnumerationValueRepository;
import dao.UserRepository;
import dao.RepositoryCatalog;
import dao.mappers.EnumerationValueMapper;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			Connection connection = DriverManager.getConnection(""
					+ "jdbc:hsqldb:hsql://localhost/workdb");
			
			IRepositoryCatalog catalogOf = new RepositoryCatalog(connection);

			
			EnumerationValue evTest = new EnumerationValue();
			evTest.setIntKey(23);
			evTest.setStringKey("ADM");
			evTest.setValue("administrator");
			evTest.setEnumerationName("admin");
			catalogOf.enumerations().add(evTest);
			
			User userTest = new User();
			userTest.setLogin("Bartosz");
			userTest.setPassword("Stocki");			
			catalogOf.users().add(userTest);
			
			UserRoles uRolTest = new UserRoles();
			uRolTest.setUserId(21);
			uRolTest.setRoleId(7);
			catalogOf.usersRoles().add(uRolTest);
		
			RolesPermissions rolPerTest= new RolesPermissions();
			rolPerTest.setRoleId(23);
			rolPerTest.setPermissionId(14);
			catalogOf.rolesPerm().add(rolPerTest);
			catalogOf.saveAndClose();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "koniec!" );
    }
}
