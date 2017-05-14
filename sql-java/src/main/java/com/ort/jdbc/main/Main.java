package com.ort.jdbc.main;

import java.util.Collection;
import com.ort.jdbc.db.connection.ConnectionManager;
import com.ort.jdbc.db.dao.PassportDAO;
import com.ort.jdbc.db.dao.impl.mysql.MysqlPassportDAO;
import com.ort.jdbc.entities.Passport;

public class Main {

	public static void main(String[] args) {
		ConnectionManager mgr = ConnectionManager.getInstance();
		mgr.openConnection();
		
		PassportDAO passportDAO = new MysqlPassportDAO(mgr);
     	Collection<Passport> passports = passportDAO.getAll(); 
     	passports.stream().forEach(System.out::println);
     	
     	
     	mgr.closeConnection();
	}

}
