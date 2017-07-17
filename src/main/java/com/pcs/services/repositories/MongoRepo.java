package com.pcs.services.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pcs.services.entities.EmployeeDTO;

@Repository
public interface MongoRepo extends MongoRepository<EmployeeDTO, String> {

	public List<EmployeeDTO> findAllEmployessByVillage(String village);

	public EmployeeDTO findEmployeeByName(String name);



	public EmployeeDTO findEmployeeById(String id);

}
