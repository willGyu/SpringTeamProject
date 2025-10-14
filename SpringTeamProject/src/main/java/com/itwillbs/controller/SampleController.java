package com.itwillbs.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.System.Logger;

//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



//import lombok.extern.java.Log;
//import lombok.extern.log4j.Log4j;


@RequestMapping("/sample/*")

@Controller
@RequestMapping(value = "/sample/*")
public class SampleController {


	
	private static final Logger logger 
		= LoggerFactory.getLogger(SampleController.class);
	
	// http://localhost:8088/all
	@GetMapping(value = "/all")
	public void doAll() {
		logger.debug(" doAll()실행! ");

    
	//private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    
	@GetMapping("/all")
	public void doAll() {
		//logger.info("do all access everybody");

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
