package com.aidy.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "MySOAPService")
public interface MySOAPService {
	@WebMethod
	public String hello();

}
