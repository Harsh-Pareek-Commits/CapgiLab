package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeServicesEmp implements EmployeeService {

	@Override
	public Employee getEmpDetails(String id, double salary, String name, String designation) {
		Employee emp =new Employee(id,salary,name,designation);
		return emp;
	}

	@Override
	public String findInsurance(double sal, String designation) {
		String ins="";
		if((sal>40000) &&(sal>20000) ) {
			if(designation.equals("HR")) {
				ins="HR PLAN 1";
			}
			else if(designation.equals("Manager")) {
				ins="Manager PLAN 1";
			}
			else {
				ins="Employee PLAN 1";
			}
		}
		else if((sal>80000) &&(sal>40000) ) {
			if(designation.equals("HR")) {
				ins="HR PLAN 2";
			}
			else if(designation.equals("Manager")) {
				ins="Manager PLAN 2";
			}
			else {
				ins="Employee PLAN 2";
			}
		}
	    else if((sal>80000) ) {
	    	if(designation.equals("HR")) {
				ins="HR PLAN 3";
			}
			else if(designation.equals("Manager")) {
				ins="Manager PLAN 3";
			}
			else {
				ins="Employee PLAN 3";
			}
		}
	    else {
	    	ins="Normal Plan";
	    }
		return ins;
	}

	@Override
	public void displayEmpDetails(Employee emp) {
	System.out.println("Name= "+ emp.getName());		
	System.out.println("Designation= "+emp.getDesignation());		
	System.out.println("Salary "+ emp.getSalary());		
	System.out.println("Insurance= "+emp.getInsuranceScheme());		
	}

}
