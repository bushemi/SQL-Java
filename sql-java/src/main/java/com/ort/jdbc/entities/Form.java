package com.ort.jdbc.entities;

public class Form extends AbstractEntity {
	
	private String _name;
	
	public Form() {
 	}

	public Form(String name) {
		super();
		this._name = name;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
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
		Form other = (Form) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return 	"id = " + getId() +
				", name=" + getName();
	}

	

	



 
 
}
