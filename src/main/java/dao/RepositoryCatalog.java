package dao;

import java.sql.Connection;
import java.sql.SQLException;





import dao.mappers.EnumerationValueMapper;
import dao.mappers.RolesPermissionsMapper;
import dao.mappers.UserMapper;
import dao.mappers.UserRolesMapper;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog {

	IEnumerationValueRepository evRepo;
	IUserRepository uRepo;
	IUserRolesRepository uRolRepo;
	IRolesPermissionsRepository rolPerRepo;
	IUnitOfWork uow;
	Connection connection;
	
	public RepositoryCatalog(Connection connection) throws SQLException {
		this.connection = connection;
		uow = new UnitOfWork(connection);
		evRepo = new EnumerationValueRepository(connection, new EnumerationValueMapper(), uow);
		uRepo = new UserRepository(connection, new UserMapper(), uow);
		uRolRepo = new UserRolesRepository(connection, new UserRolesMapper(), uow);
		rolPerRepo = new RolesPermissionsRepository(connection, new RolesPermissionsMapper(), uow);
		
	}

	public IEnumerationValueRepository enumerations() {
		return evRepo;
	}

	public IUserRepository users() {
		return uRepo;
	}
	
	public IUserRolesRepository usersRoles() {
		return uRolRepo;
	}
	
	public IRolesPermissionsRepository rolesPerm() {
		return rolPerRepo;
	}

	
	public void saveAndClose() throws SQLException {
		uow.saveChanges();
		connection.close();
		connection=null;
		
	}

}
