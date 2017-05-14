package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.MarkRepresentationDAO;
import com.ort.jdbc.entities.MarkRepresentation;

public class MysqlMarkRepresentationDAO implements MarkRepresentationDAO {
	
	private ConnectionManager _mgr;
	
	public MysqlMarkRepresentationDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}

	@Override
	public Collection<MarkRepresentation> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM mark_represent");
			Collection<MarkRepresentation> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				String represent = resultSet.getString(2);
				MarkRepresentation mr = new MarkRepresentation(represent);
				mr.setId(id);
				result.add(mr);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
