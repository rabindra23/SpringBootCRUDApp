package com.masai.app.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;

@Entity
public class I_Card {

	@Id
	@Min(1)
	private int icId;
	private int srNo;
	@OneToOne
	private Student student;
	
	public I_Card() {}

	public I_Card(int icId, int srNo, Student student) {
		super();
		this.icId = icId;
		this.srNo = srNo;
		this.student = student;
	}

	public int getIcId() {
		return icId;
	}

	public void setIcId(int icId) {
		this.icId = icId;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
