package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.UserRoles;

public class UserRolesMapper implements IMapResultSetToEntity<UserRoles>{

	public UserRoles map(ResultSet rs) throws SQLException {
		UserRoles ur = new UserRoles();
			ur.setId(rs.getInt("id"));
			ur.setUserId(rs.getInt("userId"));
			ur.setRoleId(rs.getInt("roleId"));

		return ur;
	}

}
