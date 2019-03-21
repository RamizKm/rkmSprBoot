package com.rkm;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondController {
	
	@RequestMapping("/secondContPrintMsg")
	public String printMsg(Map<String,Object> modelmap) {
		
		modelmap.put("rkmMsg", "msg from second controler");
		
		return "secondContJsp";
		
	}
	
	public SecondController() {
		System.out.println("SecondController.SecondController()");
	}

}
