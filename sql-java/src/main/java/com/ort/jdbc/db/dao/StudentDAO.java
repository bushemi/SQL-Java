package com.ort.jdbc.db.dao;

import java.util.Collection;

import com.ort.jdbc.entities.Student;

public interface StudentDAO {
	Collection<Student> getAll();
}
