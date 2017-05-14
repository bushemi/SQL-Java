package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.GroupDAO;
import com.ort.jdbc.entities.Group;

public class MysqlGroupDAO implements GroupDAO {

	private ConnectionManager _mgr;
	
	
	public MysqlGroupDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<Group> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM groups");
			Collection<Group> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				long formId = resultSet.getLong(3);
				Group group = new Group(name,formId);
				group.setId(id);
				result.add(group);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
