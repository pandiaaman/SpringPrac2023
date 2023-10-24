package com.pandiaaman.springCollectionBasics;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {

	private int teacherId;
	private String teacherName;
	private List<String> teacherEmails;
	private Set<String> teacherPhones;
	private Map<String, Integer> teacherExperience;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teacherId, String teacherName, List<String> teacherEmails, Set<String> teacherPhones,
			Map<String, Integer> teacherExperience) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherEmails = teacherEmails;
		this.teacherPhones = teacherPhones;
		this.teacherExperience = teacherExperience;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public List<String> getTeacherEmails() {
		return teacherEmails;
	}
	public void setTeacherEmails(List<String> teacherEmails) {
		this.teacherEmails = teacherEmails;
	}
	public Set<String> getTeacherPhones() {
		return teacherPhones;
	}
	public void setTeacherPhones(Set<String> teacherPhones) {
		this.teacherPhones = teacherPhones;
	}
	public Map<String, Integer> getTeacherExperience() {
		return teacherExperience;
	}
	public void setTeacherExperience(Map<String, Integer> teacherExperience) {
		this.teacherExperience = teacherExperience;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherEmails=" + teacherEmails
				+ ", teacherPhones=" + teacherPhones + ", teacherExperience=" + teacherExperience + "]";
	}
	
	
}
