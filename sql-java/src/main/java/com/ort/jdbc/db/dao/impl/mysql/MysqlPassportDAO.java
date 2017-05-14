package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.PassportDAO;
import com.ort.jdbc.entities.Passport;

public class MysqlPassportDAO implements PassportDAO {

	private ConnectionManager _mgr;
	
	public MysqlPassportDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}

	@Override
	public Collection<Passport> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM passports");
			Collection<Passport> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				String fn = resultSet.getString(2);
				String ln = resultSet.getString(3);
				Passport p = new Passport(fn, ln);
				p.setId(id);
				result.add(p);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
