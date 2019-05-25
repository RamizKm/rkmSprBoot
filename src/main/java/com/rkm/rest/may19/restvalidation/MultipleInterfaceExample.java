package com.rkm.rest.may19.restvalidation;

public class MultipleInterfaceExample implements A,B{


    @Override
    public void sayHi() {

    }
}


interface A {

    /*
    method from A
     */
    public void sayHi();
}

interface B {

    /*
    method from b
     */
    public void sayHi();
}