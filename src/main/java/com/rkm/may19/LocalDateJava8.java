package com.rkm.may19;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateJava8 {

    public  void mainDate(String[] args) {

      //  LocalDate lt=new LocalDate().now();
        Date dt=new java.util.Date();
        LocalDate dlt= LocalDate.parse("2019-05-04");
        System.out.println("LocalDateJava8.main dlt="+dlt);


    }

}
