package com.itwillbs.controller;

import java.lang.System.Logger;

//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import lombok.extern.java.Log;
//import lombok.extern.log4j.Log4j;


@RequestMapping("/sample/*")
@Controller
public class SampleController {

    
	//private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    
	@GetMapping("/all")
	public void doAll() {
		//logger.info("do all access everybody");
	}
	
	@GetMapping("/member")
	public void doMember() {
		//logger.info("logined member");
	}
	
	@GetMapping("/admin")
	public void doB() {
		//logger.info("admin only");
	}
	
}
