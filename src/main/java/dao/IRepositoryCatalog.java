package dao;

import java.sql.SQLException;

public interface IRepositoryCatalog {

	public IEnumerationValueRepository enumerations();
	public IUserRepository users();
	public IUserRolesRepository usersRoles();
	IRolesPermissionsRepository rolesPerm();
	
	public void saveAndClose() throws SQLException;
	
}
