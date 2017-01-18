package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.mappers.IMapResultSetToEntity;
import dao.uow.IUnitOfWork;
import dao.uow.IUnitOfWorkRepository;
import domain.RolesPermissions;
import domain.EnumerationValue;

public class RolesPermissionsRepository extends RepositoryBase<RolesPermissions>
	implements IRolesPermissionsRepository{

	public RolesPermissionsRepository(Connection connection,
			IMapResultSetToEntity<RolesPermissions> mapper,
			IUnitOfWork uow) {
		super(connection, mapper, uow);
	}
	
	protected void setUpdateQuery(RolesPermissions rp) throws SQLException {
		update.setInt(1, rp.getRoleId());
		update.setInt(2,rp.getPermissionId());
		update.setInt(3, rp.getId());
	}
	
	protected void setInsertQuery(RolesPermissions rp) throws SQLException {
		insert.setInt(1, rp.getRoleId());
		insert.setInt(2, rp.getPermissionId());
	}
	
	@Override
	protected String tableName() {
		return "t_sys_permissions";
	}
	@Override
	protected String createTableSql() {
		return 
				"CREATE TABLE t_sys_permissions("
						+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
						+ "roleId int,"
						+ "permissionId int"			
						+ ")";
	}
	@Override
	protected String insertSql() {
		return 
				"INSERT INTO "
				+ "t_sys_permissions(roleId, permissionId)"
				+ " VALUES (?,?)";
	}
	@Override
	protected String updateSql() {
		return "UPDATE t_sys_permissions SET roleId = ?, permissionId = ? WHERE id = ?";
		
	}

	public List<RolesPermissions> withRoleId(int roleId) {

		return null;
	}
	
	public List<RolesPermissions> withPermissionId(int permissionId) {

		return null;
	}
	
	
}
