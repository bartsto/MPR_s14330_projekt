package dao;

import java.util.List;

import domain.User;
import domain.EnumerationValue;
import domain.UserRoles;

public interface IUserRolesRepository 
	extends IRepository<UserRoles>
	{

	public List<UserRoles> withUserId (int userId);
	public List<UserRoles> withRoleId (int roleId);

}