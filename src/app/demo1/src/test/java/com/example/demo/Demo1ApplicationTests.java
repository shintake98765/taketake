package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class Demo1ApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() throws JsonProcessingException, Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String a = "a";
		
		DemoDto demoDto = new DemoDto();
		demoDto.setId(100);
		demoDto.setName("taro");
		
		this.mockMvc.perform(MockMvcRequestBuilders.get("/demo"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk());
//		.andExpect(content().json(objectMapper.writeValueAsString(demoDto)));
		
	}

}
