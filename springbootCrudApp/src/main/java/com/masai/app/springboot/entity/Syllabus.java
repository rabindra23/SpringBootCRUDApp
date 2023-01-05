package com.masai.app.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class Syllabus {

	@Id
	@Min(1)
	private int syId;
	private String syname;
	private int numberOfLectures;
	private int duration;
	
	public Syllabus() {}

	public Syllabus(int syId, String syname, int numberOfLectures, int duration) {
		super();
		this.syId = syId;
		this.syname = syname;
		this.numberOfLectures = numberOfLectures;
		this.duration = duration;
	}

	public int getSyId() {
		return syId;
	}

	public void setSyId(int syId) {
		this.syId = syId;
	}

	public String getSyname() {
		return syname;
	}

	public void setSyname(String syname) {
		this.syname = syname;
	}

	public int getNumberOfLectures() {
		return numberOfLectures;
	}

	public void setNumberOfLectures(int numberOfLectures) {
		this.numberOfLectures = numberOfLectures;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
