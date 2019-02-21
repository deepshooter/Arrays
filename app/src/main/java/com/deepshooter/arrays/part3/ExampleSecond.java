package com.deepshooter.arrays.part3;

public class ExampleSecond {

    public static void main(String[] args){

        //Example 1 :

        int[] x = new int[6];
        //System.out.println(x.length()); : Compile Time Error : Cannot find symbol , symbol : method length() location :class int[]
        System.out.println(x.length);

        //Example 2 :

        String s = "Avinash";
        //System.out.println(s.length); : Compile Time Error : cannot find symbol variable length , location : java.lang.String
        System.out.println(s.length());

        //Example 3 :

        String[] string = {"A","AA","AAA"};

        System.out.println(string.length); //Valid : 3
        //System.out.println(string.length()); // Not Valid : Compile Time Error
        //System.out.println(string[0].length); Not Valid : Compile Time Error
        System.out.println(string[0].length()); //Valid : 1

        //Example 4 :

        int[][] x1 = new int[6][3];
        System.out.println(x1.length);
        System.out.println(x1[0].length);
        System.out.println(x1[0].length+x1[1].length+x1[2].length+x1[3].length+x1[4].length+x1[5].length);

    }
}
