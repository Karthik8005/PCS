package com.pcs.services.service;

import java.util.List;

import com.pcs.services.entities.EmployeeDTO;

public interface EmployeeService {
	
	public List<EmployeeDTO> findAllEmployessByVillage(String village);

	public EmployeeDTO findEmployeeByName(String name);

	

	public EmployeeDTO findEmployeeById(String id);
	
	
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO);
	
	public void deleteEmployee(String name);

}
