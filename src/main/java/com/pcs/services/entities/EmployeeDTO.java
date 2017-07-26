package com.pcs.services.entities;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection="pcs_employess")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id","name"})

public class EmployeeDTO {
	
@JsonProperty
	private String id;
@JsonProperty
	private String name;
	
@JsonProperty
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

	@JsonAnyGetter
	public String getId() {
		return id;
	}

	@JsonAnySetter
	public void setId(String id) {
		this.id = id;
	}

	@JsonAnyGetter
	public String getName() {
		return name;
	}

	@JsonAnySetter
	public void setName(String name) {
		this.name = name;
	}

	@JsonAnyGetter
	public String getVillage() {
		return village;
	}

	@JsonAnySetter
	public void setVillage(String village) {
		this.village = village;
	}
	
	
	/*
	 * @TextIndexed
	 */
	

}
