package com.rkm.feb19;

public class ObjectEquals {

    public static void maindd(String[] args) {

        String st="ST";
        Object obj="ST";


        String objst=String.valueOf(obj);

    System.out.println("equalsdddd ="+st.equals(obj));
        System.out.println("equalsddd   secondddddd ="+obj.equals(st));
        System.out.println("odkddkdkdkdkdkd    ="+objst.equals(st));
        System.out.println("odkddkdkdkdkdkd    ="+objst.equals(obj));

        Object obbb=null;



        String obnull=String.valueOf(obbb);
        System.out.println("valueddkdkd  ="+obnull);


    }
}
