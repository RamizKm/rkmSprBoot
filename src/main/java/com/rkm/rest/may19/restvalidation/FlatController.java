package com.rkm.rest.may19.restvalidation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flatcontroller/")
public class FlatController {

    @RequestMapping("/getFlatDetailsByIdNo")
    public String getFlatDetailsByIdNo(String no){
        System.out.println("FlatController.getFlatDetailsByIdNo no="+no);

        if("302".equalsIgnoreCase(no)) {
            throw new FlatNoFoundException();
        }

        return no;

    }



}
