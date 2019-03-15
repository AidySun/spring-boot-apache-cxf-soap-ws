package com.aidy.service;

import org.springframework.stereotype.Service;

@Service
public class MySOAPServiceImpl implements MySOAPService {

	@Override
	public String hello() {
		return "Hello World!";
	}

}
