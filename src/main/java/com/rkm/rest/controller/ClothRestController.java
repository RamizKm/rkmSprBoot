package com.rkm.rest.controller;


import com.rkm.rest.exception.ClothNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClothRestController {

    @GetMapping("/getClothDetails/{clothId}")
    public ClothDO getClothDetails(@PathVariable String clothId) {
        System.out.println("ClothRestController.getClothDetails clothId=" + clothId);

        if ("21".equals(clothId)) {
            throw new ClothNotFoundException(clothId);
        }

        ClothDO clothDo = new ClothDO();
        clothDo.setClothId(clothId);
        clothDo.setClothMaterial("silk");
        clothDo.setClothPrice("INR 600");
        clothDo.setManuFacutreDate("2019-09-18");

        System.out.println("ClothRestController.getClothDetails clothdo="+clothDo);

        return clothDo;

    }


    @RequestMapping("/getClothDetailsByReqParam")
    public ResponseEntity<Object> getClothDetailsByReqParam(@RequestParam(value = "clothId")String clothId) {

        System.out.println("ClothRestController.getClothDetailsByReqParam clothId="+clothId);
        if ("21".equals(clothId)) {
            throw new ClothNotFoundException(clothId);
        }

        ClothDO clothDo = new ClothDO();
        clothDo.setClothId(clothId);
        clothDo.setClothMaterial("silk");
        clothDo.setClothPrice("INR 600");
        clothDo.setManuFacutreDate("2019-09-18");

        System.out.println("ClothRestController.getClothDetailsByReqParam clothdo="+clothDo);

        ResponseEntity obj= new ResponseEntity<>(clothDo, HttpStatus.OK);
        System.out.println("ClothRestController.getClothDetailsByReqParam obj="+obj);
        return obj;
    }


}
