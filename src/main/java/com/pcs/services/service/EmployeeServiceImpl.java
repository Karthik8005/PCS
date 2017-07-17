package com.pcs.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.pcs.services.entities.EmployeeDTO;
import com.pcs.services.repositories.MongoRepo;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	MongoRepo repo;
	
	@Autowired
	MongoTemplate template;

	@Override
	public List<EmployeeDTO> findAllEmployessByVillage(String village) {
		// TODO Auto-generated method stub
		return repo.findAllEmployessByVillage(village);
	}

	@Override
	public EmployeeDTO findEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return repo.findEmployeeByName(name);
	}

	

	@Override
	public EmployeeDTO findEmployeeById(String id) {
		// TODO Auto-generated method stub
		return repo.findEmployeeById(id);
	}

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		
		System.out.println("entered service layer");
		System.out.println(employeeDTO);
		if(employeeDTO!=null){
			System.out.println("entered to insert");
			/*repo.insert(employeeDTO);*/
		template.insert(employeeDTO);		
			System.out.println("inserted successfully");
		}else{
			return null;
		}
		
		return employeeDTO;
	}

	@Override
	public void deleteEmployee(String name) {
		// TODO Auto-generated method stub
		repo.delete(name);
		
	
	}
	
	
	
	

}
