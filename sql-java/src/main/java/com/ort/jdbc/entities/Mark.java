package com.ort.jdbc.entities;

import java.util.Date;

public class Mark extends AbstractEntity {

	private long _studentId;
	private long _groupId;
	private long _subjectId;
	private long _markId;
	private Date _date;
	private long _teacherId;
	
	public Mark() {
	}

	public Mark (long studentId,
				long groupId,
				long subjectId,
				long markId,
				Date date,
				long teacherId) 
	{
		
		this._studentId = studentId;
		this._groupId = groupId;
		this._subjectId = subjectId;
		this._markId = markId;
		this._date = date;
		this._teacherId = teacherId;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		this._studentId = studentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		this._groupId = groupId;
	}

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		this._subjectId = subjectId;
	}

	public long getMarkId() {
		return _markId;
	}

	public void setMarkId(long markId) {
		this._markId = markId;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		this._date = date;
	}

	public long getTeacherId() {
		return _teacherId;
	}

	public void setTeacherId(long teacherId) {
		this._teacherId = teacherId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((_date == null) ? 0 : _date.hashCode());
		result = prime * result + (int) (_groupId ^ (_groupId >>> 32));
		result = prime * result + (int) (_markId ^ (_markId >>> 32));
		result = prime * result + (int) (_studentId ^ (_studentId >>> 32));
		result = prime * result + (int) (_subjectId ^ (_subjectId >>> 32));
		result = prime * result + (int) (_teacherId ^ (_teacherId >>> 32));
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
		Mark other = (Mark) obj;
		long id = getId();
		long id2 = other.getId();
		if (id != 0 && id2 != 0 && id == id2) {
			return true;
		}
		if (_date == null) {
			if (other._date != null)
				return false;
		} else if (!_date.equals(other._date))
			return false;
		if (_groupId != other._groupId)
			return false;
		if (_markId != other._markId)
			return false;
		if (_studentId != other._studentId)
			return false;
		if (_subjectId != other._subjectId)
			return false;
		if (_teacherId != other._teacherId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return 	"id = " + getId() +
				", studentId = " + getStudentId() + 
				", groupId = " + getGroupId() + 
				", subjectId = " + getSubjectId() + 
				", markId = " + getMarkId() + 
				", date = " + getDate() + 
				", teacherId = " + getTeacherId();
	}
	
	
	
	
	
	
}
