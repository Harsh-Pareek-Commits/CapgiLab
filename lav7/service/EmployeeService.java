package com.cg.eis.service;

import java.util.List;
import java.util.Set;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public boolean insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public Set<Employee> getAllEmployeesByInsurance(String insurance);
	public boolean deleteEmployee(int id);
}
