package com.deepshooter.arrays.part2;

public class ExampleSecond {

    public static void main(String[] args) {
        //Example 1:

        System.out.println("Example 1");
        int[] x = new int[3];

        System.out.println(x);    //[I@1b6d3586
        System.out.println(x[0]); //0


        //Example 2:
        System.out.println("Example 2");

        int[][] x1 = new int[2][3];
        System.out.println(x1);        //[[I@4554617c
        System.out.println(x1[0]);     //[I@74a14482  ->One Dimensional Array Reference i.e. x1[0][0]
        System.out.println(x1[0][0]);  //0


        //Example 3:

        System.out.println("Example 3");

        int[][] x2 = new int[2][];
        System.out.println(x2);         //[[I@1540e19d
        System.out.println(x2[0]);      //null
        //System.out.println(x2[0][0]);   //java.lang.NullPointerException

        //Example 4:
        System.out.println("Example 4");

        int[] a = new int[6];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        a[5] = 60;

        //a[6] = 70;  //Run Time Exception : ArrayIndexOutOfBoundsException
        //a[-6] = 80;  //Run Time Exception : ArrayIndexOutOfBoundsException
        // a[2.5] = 90 ; //Compile Time Error : PLP : Incompatible Types : Found : Double ,Required : int
        //PLP = Possible Loss Of Precision

    }
}
