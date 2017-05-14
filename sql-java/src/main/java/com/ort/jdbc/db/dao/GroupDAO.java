package com.ort.jdbc.db.dao;

import java.util.Collection;

import com.ort.jdbc.entities.Group;

public interface GroupDAO {
	Collection<Group> getAll();
}
