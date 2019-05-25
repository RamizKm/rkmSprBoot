package com.rkm.resttemplateconsumer;

import com.rkm.rest.controller.ClothDO;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class ClothRestConsumerController {

    public ClothRestConsumerController(){
        System.out.println("ClothRestConsumerController.ClothRestConsumerController");
    }

    @GetMapping("/consumeRestServiceofCloth/{clothId}")
    public ClothDO getClothDetails(@PathVariable String clothId) {
        System.out.println("ClothRestConsumerController.getClothDetails started");


        RestTemplate rst=new RestTemplate();
        //POPULATE HADER
        HttpHeaders httph=new HttpHeaders();
        httph.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        //populate httpentity
        HttpEntity<String> entity=new HttpEntity<String>(httph);

      Object result=  rst.exchange("http://localhost:8082/getClothDetailsByReqParam?clothId=29", HttpMethod.GET,entity,ClothDO.class).getBody();
        System.out.println("ClothRestConsumerController.getClothDetails rsult="+result);
        System.out.println("ClothRestConsumerController.getClothDetails class="+result.getClass().getName());
        return (ClothDO) result;

    }

    @GetMapping("/simpleString")
    public String getSimpleString() {
        System.out.println("ClothRestConsumerController.getSimpleString");
    return "in the name of allah the most beneficial and merciful";

    }


}
