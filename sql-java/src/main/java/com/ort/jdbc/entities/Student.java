package com.ort.jdbc.entities;

import java.util.Date;

public class Student extends AbstractEntity {

	private long _passportId;
	private Date _startDate;
	private Date _finishDate;
	
	public Student() {
	}
	
	public Student (long passportId,
					Date startDate, 
					Date finishDate) {
		super();
		this._passportId = passportId;
		this._startDate = startDate;
		this._finishDate = finishDate;
	}
	
	public long getPassportId() {
		return _passportId;
	}
	public void setPassportId(long passportId) {
		this._passportId = passportId;
	}
	public Date getStartDate() {
		return _startDate;
	}
	public void setStartDate(Date startDate) {
		this._startDate = startDate;
	}
	public Date getFinishDate() {
		return _finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this._finishDate = finishDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((_finishDate == null) ? 0 : _finishDate.hashCode());
		result = prime * result + (int) (_passportId ^ (_passportId >>> 32));
		result = prime * result + ((_startDate == null) ? 0 : _startDate.hashCode());
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
		Student other = (Student) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_finishDate == null) {
			if (other._finishDate != null)
				return false;
		} else if (!_finishDate.equals(other._finishDate))
			return false;
		if (_passportId != other._passportId)
			return false;
		if (_startDate == null) {
			if (other._startDate != null)
				return false;
		} else if (!_startDate.equals(other._startDate))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return 	"id = "+getId()+
				", passportId = " + getPassportId() + 
				", startDate = " + getStartDate() + 
				", finishDate = " + getFinishDate();
	}
	
	
}
