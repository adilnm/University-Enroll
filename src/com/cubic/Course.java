package com.cubic;

public class Course {
	private String stdName;
	private String profName;
	private String coursename;
	private String courseid;
	
	public Course(String stdName, String profName, String coursename, String courseid) {
		super();
		this.stdName = stdName;
		this.profName = profName;
		this.coursename = coursename;
		this.courseid = courseid;
	}
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	
}
