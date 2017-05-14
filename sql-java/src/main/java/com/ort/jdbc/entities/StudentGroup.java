package com.ort.jdbc.entities;

public class StudentGroup {

	private long _studentId;
	private long _groupId;
	
	public StudentGroup() {
	}
	
	public StudentGroup (long studentId, long groupId) {
		this._studentId = studentId;
		this._groupId = groupId;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (_groupId ^ (_groupId >>> 32));
		result = prime * result + (int) (_studentId ^ (_studentId >>> 32));
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
		StudentGroup other = (StudentGroup) obj;
		if (_groupId != other._groupId)
			return false;
		if (_studentId != other._studentId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return 	"studentId = " + getStudentId() + 
				", groupId = " + getGroupId();
	}
	
	
}
