package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Employee;

/**
 * @author  srisailam paka
 *
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
