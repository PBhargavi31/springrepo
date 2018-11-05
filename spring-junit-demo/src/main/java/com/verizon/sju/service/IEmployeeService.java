package com.verizon.sju.service;

import java.util.List;

import com.verizon.sju.model.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(Employee emp);

	public void deleteEmployee(Long empId);

	public Employee getEmployeeById(Long empId);

	public List<Employee> listEmployees();
}
