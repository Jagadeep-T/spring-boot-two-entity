package com.springboot.cruddemo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="department_code")
	private int departmentCode;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="employe_status")
	private String employeStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="location_id")
	private Location location;
	
	
	public Employee() {
		
	}


	public Employee(int departmentCode, String departmentName, String employeStatus, Location location) {
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.employeStatus = employeStatus;
		this.location = location;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getEmployeStatus() {
		return employeStatus;
	}


	public void setEmployeStatus(String employeStatus) {
		this.employeStatus = employeStatus;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", departmentCode=" + departmentCode + ", departmentName=" + departmentName
				+ ", employeStatus=" + employeStatus + ", location=" + location + "]";
	}







	
	
}