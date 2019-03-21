package com.rkm.rest;

public class ClassDto {
	
	private String classId;
	private String className;
	private String classTeacher;
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public ClassDto(String classId, String className, String classTeacher) {
		super();
		this.classId = classId;
		this.className = className;
		this.classTeacher = classTeacher;
	}
	
	

}
