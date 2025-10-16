package com.itwillbs.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



//import lombok.extern.java.Log;
//import lombok.extern.log4j.Log4j;


@Controller
@RequestMapping(value = "/sample/*")
public class SampleController {


	
	private static final Logger logger 
		= LoggerFactory.getLogger(SampleController.class);
	
	// http://localhost:8088/all
	@GetMapping(value = "/all")
	public void doAll() {
		logger.debug(" doAll()실행! ");
	}
   
	
	@GetMapping(value = "/member")
	public void doMember() {

		logger.debug(" doMember()실행! ");

		//logger.info("logined member");
	}
	
	@GetMapping("/admin")
	public void doB() {
		//logger.info("admin only");

	}
	
}
