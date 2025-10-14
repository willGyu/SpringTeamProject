package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board/*")
public class YhmTestController {
	
	
	private static final Logger logger 
		= LoggerFactory.getLogger(YhmTestController.class);
	
	
	// http://localhost:8088/board/index
	@GetMapping(value = "/index")
	public void Index() {
		logger.debug(" Index() 실행 ");
		logger.debug(" 서버설정 / 로 변경 요망 ");
	}

}
