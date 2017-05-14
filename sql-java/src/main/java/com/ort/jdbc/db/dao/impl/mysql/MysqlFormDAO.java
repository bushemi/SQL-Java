package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.FormDAO;
import com.ort.jdbc.entities.Form;

public class MysqlFormDAO implements FormDAO {

	private ConnectionManager _mgr;
	
	
	public MysqlFormDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<Form> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM forms");
			Collection<Form> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				Form form = new Form(name);
				form.setId(id);
				result.add(form);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
