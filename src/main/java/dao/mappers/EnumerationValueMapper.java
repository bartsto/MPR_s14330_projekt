package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.EnumerationValue;

public class EnumerationValueMapper implements IMapResultSetToEntity<EnumerationValue>{

	public EnumerationValue map(ResultSet rs) throws SQLException {
		EnumerationValue ev = new EnumerationValue();
			ev.setId(rs.getInt("id"));
			ev.setIntKey(rs.getInt("intKey"));
			ev.setStringKey(rs.getString("stringKey"));
			ev.setValue(rs.getString("value"));
			ev.setEnumerationName(rs.getString("enumerationName"));

		return ev;
	}

}
