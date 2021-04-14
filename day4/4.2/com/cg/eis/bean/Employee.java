package com.cg.eis.bean;

public class Employee {
private String id;
private double salary;
private String name;
private String designation;
private String insuranceScheme;
public Employee(String id, double salary, String name, String designation) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.designation = designation;
}

//GETTER AND SETTERS
public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsuranceScheme() {
	return insuranceScheme;
}
public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme = insuranceScheme;
}

}
