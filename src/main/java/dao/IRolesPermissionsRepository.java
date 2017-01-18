package dao;

import java.util.List;

import domain.RolesPermissions;
import domain.User;
import domain.EnumerationValue;
import domain.UserRoles;

public interface IRolesPermissionsRepository 
	extends IRepository<RolesPermissions>
	{

	public List<RolesPermissions> withRoleId (int roleId);
	public List<RolesPermissions> withPermissionId( int permissionId);

}