package com.rkm.rest.exceptioinHandler;

import com.rkm.rest.controller.ClothDO;
import com.rkm.rest.exception.ClothNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ClothExceptionHandler  extends ResponseEntityExceptionHandler {



    @ExceptionHandler(ClothNotFoundException.class)
    public void ClothDoesnotExist(HttpServletResponse response)  throws IOException {
        System.out.println("ClothExceptionHandler.ClothDoesnotExist");
        System.out.println("ClothExceptionHandler.ClothDoesnotExist sendig va="+HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value());

    }

}
