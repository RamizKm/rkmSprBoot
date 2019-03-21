package com.rkm.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MercyFulRestController {
	
	public MercyFulRestController() {
		System.out.println("MercyFulRestController.MercyFulRestController()");
	}

	
	@RequestMapping("/getProdDetails")
	public ProdcutDo getProductName() {
		
		String name="Parle G PRODUCT .Old brand of India";
		ProdcutDo prddo=new ProdcutDo();
		prddo.setProdName(name);
		prddo.setProdId("parle1");
		prddo.setProdPrice("123");
		
		
		return prddo;
		
	}
	
	
}
