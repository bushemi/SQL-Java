package com.ort.jdbc.entities;

public class Teacher extends AbstractEntity {

	private long _passportId;

	
	public Teacher() {
	}
	public Teacher(long passportId) {
		super();
		this._passportId = passportId;
	}
	
	public long getPassportId() {
		return _passportId;
	}

	public void setPassportId(long passportId) {
		this._passportId = passportId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (_passportId ^ (_passportId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_passportId != other._passportId)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "id = "+ getId() +
				", passportId = " + getPassportId();
	}

	

}
