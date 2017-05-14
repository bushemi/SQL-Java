package com.ort.jdbc.db.dao.impl.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.MarkDAO;
import com.ort.jdbc.entities.Mark;

public class MysqlMarkDAO implements MarkDAO {
	
	private ConnectionManager _mgr;
	
	
	public MysqlMarkDAO(ConnectionManager mgr) {
		_mgr = mgr;
	}


	@Override
	public Collection<Mark> getAll() {
		Connection connection = _mgr.getConnection();
		try {
			Statement st = connection.createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM marks");
			Collection<Mark> result = new ArrayList<>();
			while(resultSet.next()) {
				long id = resultSet.getLong(1);
				long stId = resultSet.getLong(2);
				long grId = resultSet.getLong(3);
				long subjId = resultSet.getLong(4);
				long markId = resultSet.getLong(5);
				Date date = resultSet.getDate(6);
				long teachId = resultSet.getLong(7);
				Mark mark = new Mark
							(stId, grId, subjId, markId, date, teachId);
				mark.setId(id);
				result.add(mark);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
