package com.ort.jdbc.entities;

public abstract class AbstractEntity {
	private long _id = 0;

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		if (_id != 0) {
			throw new IllegalStateException("Id cannot be replaced");
		}
		_id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (_id ^ (_id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		if (_id != other._id)
			return false;
		return true;
	}
	
	
	
}
