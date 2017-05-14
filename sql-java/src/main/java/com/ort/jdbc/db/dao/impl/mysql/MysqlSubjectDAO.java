package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.SubjectDAO;
import com.ort.jdbc.entities.Subject;

public class MysqlSubjectDAO implements SubjectDAO {

	private ConnectionManager _mgr;
	
	
	public MysqlSubjectDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<Subject> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM subjects");
			Collection<Subject> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				String name = resultSet.getString(2);
				Subject subj = new Subject(name);
				subj.setId(id);
				result.add(subj);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
