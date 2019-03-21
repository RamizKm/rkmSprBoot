package com.rkm.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductRestController {
	
	public ProductRestController() {
		System.out.println("ProductRestController.ProductRestController() constructor");
	}
	
	
	@RequestMapping("/getClassDtls")
	public ResponseEntity<List> getClassDetails(){
		
		ClassDto ctd=new ClassDto("12", "class 5", "rkm");
		ClassDto fkm=new ClassDto("13", "class 6", "fkm");
		ClassDto skm=new ClassDto("14", "class 7", "tkm");
		
		List clt=new ArrayList<ClassDto>();
		clt.add(ctd);
		clt.add(fkm);
		clt.add(skm);
		
		System.out.println("ProductRestController.getClassDetails() clt="+clt);
		return new ResponseEntity<>(clt, HttpStatus.OK);
		
		
	}

}
