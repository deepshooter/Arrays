package com.deepshooter.arrays.part4;

public class Example {

    public static void main(String[] args){

        //Example : 1

        int[] x   = {10,20,30,40};
        char[] ch = {'a','b','c','d'};

        int[] b = x;  //Valid
        //int[] c = ch; //Not Valid : Compile Time Error : Incompatible Types Found : char[] , Required :int[]


       //Example : 2
        String[] s = {"A","B","C"};
        Object[] o = s;


        //Example : 3

        int[] a1 = {10,20,30,40,50,60};
        int[] b1 = {70,80};

        a1 = b1;  //Valid
        b1 = a1;  //Valid


        //Example : 4

        int[][] a =new int[3][];

        //a[0] = new int[4][3]; //Compile Time Error : Incompatible Types Found : int[][] , Required int[]

        //a[0] = 10; //Compile Time Error : Incompatible Types Found : int , Required int[]

        a[0] = new int[2]; //Valid

    }

}
