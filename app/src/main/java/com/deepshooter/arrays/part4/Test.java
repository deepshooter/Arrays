package com.deepshooter.arrays.part4;

public class Test {

    public static void main(String[] args){

        //Example  : 1

        for(int i=0 ; i<=args.length ; i++)
        {
            System.out.println(args[i]);
        }

         //Output:
        //Java Test A B C  = A , B , C  Runtime Error : ArrayIndexOutOfBoundException
        //Java Test A B = A , B , Runtime Error : ArrayIndexOutOfBoundException
        //Java Test =  Runtime Error : ArrayIndexOutOfBoundException


        //Example : 2

        String[] argh = {"X","Y","Z"};

        args = argh ;

        for(String s : args){
            System.out.println(s);
        }

        //Output:
        //Java Test A B C  = X , Y , Z
        //Java Test A B = X , Y , Z
        //Java Test =  X , Y , Z


        //Example : 3

        int[][] a = new int[4][3]; //Object Created  = 5
        a[0] = new int[4];  //Object Created  = 1
        a[1] = new int[2];  //Object Created  = 1
        a = new int[3][2]; //Object Created  = 4

        //Total how many objects created ?: 11
        //Total how many objects eligible for Garbage Collection ?: 7

    }
}
