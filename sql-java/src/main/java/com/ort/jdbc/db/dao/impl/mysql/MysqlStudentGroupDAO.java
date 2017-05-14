package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.StudentGroupDAO;
import com.ort.jdbc.entities.StudentGroup;

public class MysqlStudentGroupDAO implements StudentGroupDAO {

	private ConnectionManager _mgr;
	
	
	public MysqlStudentGroupDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<StudentGroup> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM student_group");
			Collection<StudentGroup> result = new ArrayList<>();
			while(resultSet.next()) {
				long stId = resultSet.getLong(1);
				long grId = resultSet.getLong(2);
				StudentGroup p = new StudentGroup(stId,grId);
				result.add(p);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
