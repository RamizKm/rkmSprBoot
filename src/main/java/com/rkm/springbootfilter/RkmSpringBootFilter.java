package com.rkm.springbootfilter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

@Component
public class RkmSpringBootFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("RkmSpringBootFilter.init filter config="+filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpReq= (HttpServletRequest) servletRequest;
        httpReq.setAttribute("firstReqAttr",new java.util.Date());

        Enumeration<String> headerKey=httpReq.getHeaderNames();
String headersingleKey=null;




        while(headerKey.hasMoreElements()) {
            String hkey=headerKey.nextElement();
            System.out.println("RkmSpringBootFilter.doFilter header key="+hkey);
            System.out.println("RkmSpringBootFilter.doFilter header value="+httpReq.getHeader(hkey));

        }


        System.out.println("RkmSpringBootFilter.doFilter httpReq="+httpReq);
        filterChain.doFilter(servletRequest,servletResponse);//if it is missing request will not be forwarded to internal classes
    }

    @Override
    public void destroy() {
        System.out.println("RkmSpringBootFilter.destroy application going down");
    }
}
