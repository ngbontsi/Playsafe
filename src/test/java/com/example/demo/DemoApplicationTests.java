package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests extends DemoBuilder{

	@Test
	void contextLoads() {

	 String ktocUri = "/conversions/ktoc";
	 String ktomUri = "/conversions/ktom";
	 String ctokUri = "/conversions/ctok";
	 String mtokUri = "/conversions/mtok";

	   MvcResult ktocResult = mvc.perform(MockMvcRequestBuilders.get(ktocUri)
	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	   MvcResult ktomResult = mvc.perform(MockMvcRequestBuilders.get(ktomUri)
	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	   MvcResult ctokResult = mvc.perform(MockMvcRequestBuilders.get(ctokUri)
	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	   MvcResult mtokResult = mvc.perform(MockMvcRequestBuilders.get(mtokUri)
	      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

	   int ktocStatus = ktocResult.getResponse().getStatus();
	   assertEquals(200, ktocStatus);
	   System.out.println(ktocResult.getResponse().getContentAsString());
	
	   int ktomsStatus = ktomResult.getResponse().getStatus();
	   assertEquals(200, ktomsStatus);
	   System.out.println(ktomResult.getResponse().getContentAsString());

	   int ctokStatus = ctokResult.getResponse().getStatus();
	   assertEquals(200, ctokStatus);
	   System.out.println(ctokResult.getResponse().getContentAsString());

	   int mtokStatus = mtokResult.getResponse().getStatus();
	   assertEquals(200, mtokStatus);
	   System.out.println(mtokResult.getResponse().getContentAsString());
	
	



	}

}
