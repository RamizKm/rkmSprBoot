package com.rkm.rest.exception;

public class VehilceNotFoundException  extends RuntimeException{

    public VehilceNotFoundException(String veheicleId) {
        super("vehicle "+veheicleId+" does not exist in system") ;
        System.out.println("VehilceNotFoundException.VehilceNotFoundException started.");

        }


    }
