package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImp implements EmployeeService {
	HashMap<Integer, Employee> myhash = new HashMap<Integer, Employee>();
	HashMap<String, Set<Employee>> schemeToList = new HashMap<String, Set<Employee>>();

	public boolean insertEmployee(Employee e) {
		myhash.put(e.getId(), e);
		String ins = e.getInsuranceScheme();
		if (schemeToList.containsKey(ins)) {
			Set<Employee> hs = schemeToList.get(ins);
			hs.add(e);
		} else {
			Set<Employee> temp = new HashSet<Employee>();
			temp.add(e);
			schemeToList.put(ins, temp);
		}
		return true;

	}

	public List<Employee> getAllEmployees() {
		List<Employee> mylist = new ArrayList<Employee>();
		for (Entry<Integer, Employee> es : myhash.entrySet()) {
			mylist.add(es.getValue());

		}
		return mylist;
	}

	public Set<Employee> getAllEmployeesByInsurance(String insurance) {

		return schemeToList.get(insurance);
	}

	public boolean deleteEmployee(int id) {
		
		
         if(myhash.containsKey(id)) {
        	 myhash.remove(id);
        		for (Entry<String, Set<Employee>> empHs : schemeToList.entrySet()) {
        			for(Employee emp : empHs.getValue()) {
        				if(emp.getId() == id) {
        					empHs.getValue().remove(emp);
        				}
        			}
        		}
        	
        	 return true;
        	 
         }
         else {
		return false;
         }
	}

}
