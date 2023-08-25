package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_deatails")
public class Access {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;
	

	@Column(name = "student_name")
    private String studentName;

    @Column(name = "department")
    private String department;

    @Column(name = "email")
    private String email;

    public Long getstudentId() {
		return studentId;
	}

	public void setstudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getdepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}


}