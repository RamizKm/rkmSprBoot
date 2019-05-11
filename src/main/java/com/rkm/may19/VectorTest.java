package com.rkm.may19;

public class VectorTest {

    public  void mainList(String[] args) {

        java.util.Vector<String> vt=new java.util.Vector();
        vt.add("satara");
        vt.add("koregaon");
        vt.add("pusegaon");
        vt.add("vadju");


        vt.forEach(strValue->System.out.println(strValue));




    }

}
