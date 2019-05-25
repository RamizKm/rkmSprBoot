package com.rkm.rest.controller;


import com.rkm.rest.exception.VehilceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehilceFindingController {
//when using spring rest boot , we do not have path @pathparam from jersey api


    public VehilceFindingController() {
        System.out.println("VehilceFindingController.VehilceFindingController constructor");
    }

    @GetMapping("/findRoom/{vehicleId}")
    public String findVehile(@PathVariable String vehicleId) {
        System.out.println("VehilceFindingController.findVehile vehilceid="+vehicleId);

    if("22".equalsIgnoreCase(vehicleId)) {
        System.out.println("VehilceFindingController.findVehile before throwing exception");
        throw new VehilceNotFoundException(vehicleId);
    }
    return "vehicle="+vehicleId+" exists in sysstem";

    }

}
