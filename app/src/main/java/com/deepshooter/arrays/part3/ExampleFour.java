package com.deepshooter.arrays.part3;

public class ExampleFour {

    public static void main(String[] args){

        //Example : 1

        int[] x = new int[5];
        x[0] = 10;
        x[1] = 'a';

        byte b = 20;
        x[2] = b;

        short s = 30;
        x[3] = s;

        //x[4] = 10l; Compile Time Error : PLP Found : lang , Required : int


        //Example : 2

        Object[] a = new Object[10];
        a[0] = new Object();
        a[1] = new String("Avinash");
        a[2] = new Integer(10);


        //Example : 3

        Number[] n = new Number[10];
        n[0] = new Integer(10);
        n[1] = new Double(10.5);
       // n[2] = new String("Avinash");  Compile Time Error : Incompatible Type , Found : java.lang.String , required java.lang.Number


        //Number Child classes : byte , short , int ,long , float ,double


        //Example : 4

        Runnable[] r = new Runnable[10];
        r[0] = new Thread();
        //r[1] = new String(); Compile Time Error : Incompatible Type , Found : java.lang.String , required java.lang.Runnable



    }

}
