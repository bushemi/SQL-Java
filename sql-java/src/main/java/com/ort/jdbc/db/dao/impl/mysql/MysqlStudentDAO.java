package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.StudentDAO;
import com.ort.jdbc.entities.Student;

public class MysqlStudentDAO implements StudentDAO {

	private ConnectionManager _mgr;
	
	
	public MysqlStudentDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<Student> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM students");
			Collection<Student> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				long passId = resultSet.getLong(2);
				Date sd = resultSet.getDate(3);
				Date fd = resultSet.getDate(4);
				Student stud = new Student(passId,sd,fd);
				stud.setId(id);
				result.add(stud);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
