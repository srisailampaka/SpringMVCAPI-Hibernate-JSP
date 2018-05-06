package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Employee;

/**
 * @author  srisailam paka
 *
 */
public interface EmployeeDao {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
