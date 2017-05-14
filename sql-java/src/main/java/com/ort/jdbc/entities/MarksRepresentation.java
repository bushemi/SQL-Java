package com.ort.jdbc.entities;

public class MarksRepresentation extends AbstractEntity {
	
	private String _representation;

	public MarksRepresentation() {
	
	}

	public MarksRepresentation(String representation) {
		super();
		this._representation = representation;
	}

	public String getRepresentation() {
		return _representation;
	}

	public void setRepresentation(String representation) {
		this._representation = representation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((_representation == null) ? 0 : _representation.hashCode());
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
		MarksRepresentation other = (MarksRepresentation) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_representation == null) {
			if (other._representation != null)
				return false;
		} else if (!_representation.equals(other._representation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return 	"id = " + getId() +
				", representation = " + getRepresentation();
	}
	
	
}
