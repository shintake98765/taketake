package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoService {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Transactional
	public DemoDto updateData() {
		DemoDto demoDto = new DemoDto();
		
		jdbcTemplate.queryForList("SELECT * FROM USER_TBL");
		
		return demoDto;
	}
	
	private Boolean aaa() {
		return null;
	}

}
