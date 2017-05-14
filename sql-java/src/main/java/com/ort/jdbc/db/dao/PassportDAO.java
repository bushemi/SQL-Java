package com.ort.jdbc.db.dao;

import java.util.Collection;

import com.ort.jdbc.entities.Passport;

public interface PassportDAO {
	Collection<Passport> getAll();
}
