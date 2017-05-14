package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.SubjectTeacherDAO;
import com.ort.jdbc.entities.SubjectTeacher;

public class MysqlSubjectTeacherDAO implements SubjectTeacherDAO {

	private ConnectionManager _mgr;
	
	
	public MysqlSubjectTeacherDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<SubjectTeacher> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM subject_teacher");
			Collection<SubjectTeacher> result = new ArrayList<>();
			while(resultSet.next()) {
				long subjId = resultSet.getLong(1);
				long teachId = resultSet.getLong(2);
				SubjectTeacher s = new SubjectTeacher(subjId,teachId);
				result.add(s);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
