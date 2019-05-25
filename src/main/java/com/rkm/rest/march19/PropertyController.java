package com.rkm.rest.march19;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
@Controller
public class PropertyController {


    public PropertyController() {
        System.out.println("testing msg");
    }

    @Value("${rkm.property.check}")
    private String propValue;

    @RequestMapping("/propReader")
    public String getPropMsg(Map<String,Object> modelMap) {

    modelMap.put("propMsg",propValue);
    return "propController";
    }

    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }
}
