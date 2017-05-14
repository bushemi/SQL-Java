package com.ort.jdbc.entities;

public class Group extends AbstractEntity {

	private String _name;
	private long _formId;
	
	
	public Group() {
	}

	public Group(String _name, long _formId) {
		super();
		this._name = _name;
		this._formId = _formId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public long getFormId() {
		return _formId;
	}

	public void setFormId(long formId) {
		this._formId = formId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (_formId ^ (_formId >>> 32));
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
		Group other = (Group) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_formId != other._formId)
			return false;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return 	"id = "+ getId() +
				", name = " + getName() + 
				", formId = " + getFormId() ;
	}
	
	
}
