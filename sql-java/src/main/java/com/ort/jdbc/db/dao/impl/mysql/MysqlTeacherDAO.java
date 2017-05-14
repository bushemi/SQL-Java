package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.TeacherDAO;
import com.ort.jdbc.entities.Teacher;

public class MysqlTeacherDAO implements TeacherDAO {

	private ConnectionManager _mgr;
	
	public MysqlTeacherDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}

	@Override
	public Collection<Teacher> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM teachers");
			Collection<Teacher> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				long passId = resultSet.getLong(2);
				
				Teacher teacher = new Teacher(passId);
				teacher.setId(id);
				result.add(teacher);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
