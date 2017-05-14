package com.ort.jdbc.entities;

public class Passport extends AbstractEntity {
	private String _firstName;
	private String _lastName;
	
	public Passport() {
	}
	
	public Passport(String firstName, String lastName) {
		super();
		_firstName = firstName;
		_lastName = lastName;
	}
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((_firstName == null) ? 0 : _firstName.hashCode());
		result = prime * result + ((_lastName == null) ? 0 : _lastName.hashCode());
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
		Passport other = (Passport) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_firstName == null) {
			if (other._firstName != null)
				return false;
		} else if (!_firstName.equals(other._firstName))
			return false;
		if (_lastName == null) {
			if (other._lastName != null)
				return false;
		} else if (!_lastName.equals(other._lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id = " + getId() + 
				", firstName=" + getFirstName() + 
				", lastName=" + getLastName();
	}
	
}
