package com.ort.jdbc.entities;

public class SubjectTeacher {

	private long _subjectId;
	private long _teacherId;
	public SubjectTeacher() {
	}
	public SubjectTeacher(long subjectId, long teacherId) {
		super();
		this._subjectId = subjectId;
		this._teacherId = teacherId;
	}
	public long getSubjectId() {
		return _subjectId;
	}
	public void setSubjectId(long subjectId) {
		this._subjectId = subjectId;
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
		int result = 1;
		result = prime * result + (int) (_subjectId ^ (_subjectId >>> 32));
		result = prime * result + (int) (_teacherId ^ (_teacherId >>> 32));
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
		SubjectTeacher other = (SubjectTeacher) obj;
		if (_subjectId != other._subjectId)
			return false;
		if (_teacherId != other._teacherId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return 	"subjectId = " + getSubjectId() + 
				", teacherId = " + getTeacherId();
	}
	
	
}
