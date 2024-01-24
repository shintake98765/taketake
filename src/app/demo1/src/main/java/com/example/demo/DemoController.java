package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	private final DemoService demoService;
	
	@GetMapping
	public DemoDto demo() {
		DemoDto demoDto = demoService.updateData();
		return demoDto;
	}

}
