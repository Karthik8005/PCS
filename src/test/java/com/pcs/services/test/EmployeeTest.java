package com.pcs.services.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.pcs.services.entities.EmployeeDTO;
import com.pcs.services.service.EmployeeServiceImpl;

public class EmployeeTest {
	
	EmployeeServiceImpl serv;
	
	@Test
	public void findAllEmployeesByVillage(String village){
		
		List<EmployeeDTO> expectedresult=new ArrayList<>();
		
		EmployeeDTO employee=new EmployeeDTO("karthik","aleti");
		EmployeeDTO employee1=new EmployeeDTO("kushal","yalla");
		EmployeeDTO employee2=new EmployeeDTO("pramod","kunta");
		expectedresult.add(employee2);
		expectedresult.add(employee1);
		expectedresult.add(employee);
		
		
		
		/*Assert.assertArrayEquals(expectedresult,serv.findAllEmployessByVillage(village));
*/	}

}
