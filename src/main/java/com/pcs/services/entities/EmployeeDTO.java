package com.pcs.services.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="pcs_employess")
public class EmployeeDTO {
	
	@Id
	private String id;
	
	@TextIndexed
	private String name;
	
	@TextIndexed 
	private String village;
	
	public EmployeeDTO(String name,String village){
		this.name=name;
		this.village=village;
	}

	@PersistenceConstructor
	public EmployeeDTO(String id, String name, String village) {
		super();
		this.id = id;
		this.name = name;
		this.village = village;
	}

	//default constructor
	public EmployeeDTO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
	
	
	
	

}
