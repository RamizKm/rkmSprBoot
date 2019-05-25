package com.rkm.rest.exception;

public class ClothNotFoundException extends RuntimeException {

    public ClothNotFoundException(String clothId) {
        super("Cloth "+clothId+" does not exist in system");
    }


}
