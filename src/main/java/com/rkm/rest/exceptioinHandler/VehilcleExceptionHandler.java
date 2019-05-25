package com.rkm.rest.exceptioinHandler;

import com.rkm.rest.exception.VehilceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class VehilcleExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        System.out.println("VehilcleExceptionHandler.handleExceptionInternal startdd");


        return super.handleExceptionInternal(ex, body, headers, status, request);
    }


    @ExceptionHandler(VehilceNotFoundException.class)
    public void vehilcleNotFound(HttpServletResponse response) throws IOException {
        System.out.println("VehilcleExceptionHandler.vehilcleNotFound started");

        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value());
        System.out.println("VehilcleExceptionHandler.vehilcleNotFound after sending response");
    }

}

