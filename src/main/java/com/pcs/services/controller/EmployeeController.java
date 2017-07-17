package com.pcs.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pcs.services.entities.EmployeeDTO;
import com.pcs.services.service.EmployeeServiceImpl;

@RestController
@RequestMapping(path="employees")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl serv;
	
	/*@RequestMapping(method=RequestMethod.GET)
		public String hello(){
		return "hai from karthik";
	}
	*/
	
	@RequestMapping(method=RequestMethod.GET,value="/{village}",consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<EmployeeDTO> findAllEmployeesByVillage(@PathVariable String village){
		System.out.println("entered controller");
		return serv.findAllEmployessByVillage(village);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
     public @ResponseBody EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO) {
		
		System.out.println("entered controller");
		
		System.out.println(employeeDTO.toString());
		
		serv.addEmployee(employeeDTO);
		
		return employeeDTO;
	}

}
