package com.deepshooter.arrays.part2;

public class Note {

    /*

       ---------- 3.Array Creation (2 Dimensional Array)------------

      In Java 2 Dimensional Array not implemented by using matrix style,SUN people followed Array of
      Arrays approach for multidimensional Array creation.

      The main advantage of this approach is memory utilization will be improved.


      Example 1:

      int[][] x = new int[2][];
              x[0] = new int[2];
              x[1] = new int[3];


     Example 2:

         int[][][] x1 = new int[2][][];

          x1[0] = new int[3][];
          x1[0][0] = new int[1];
          x1[0][1] = new int[2];
          x1[0][2] = new int[3];

          x1[1] = new int[2][2];

    Example 3 :

       //Which of the following Array declarations are valid:


        int[] a1       = new int[];         //Not Valid   : At least  Base size is required
        int[] a2       = new int[3];        //Valid       :
        int[][] a3     = new int[][];      //Not Valid    : At least  Base size is required
        int[][] a4     = new int[3][];     //Valid
        int[][] a5     = new int[][4];     //Not Valid    : At least  Base size is required
        int[][] a6     = new int[3][4];    //Valid
        int[][][] a7   = new int[3][4][5]; //Valid
        int[][][] a8   = new int[3][4][];  //Valid
        int[][][] a9   = new int[3][][5];  //Not Valid    : Without Second How can you decide third size
        int[][][] a10  = new int[][4][5];  //Not Valid    : At least  Base size is required



       ----------------4.Array Initialization--------------

        Once we creates an Array every Array elements by default initialized with default values.

       //Example 1:

        int[] x = new int[3];

        System.out.println(x);    //[I@1b6d3586
        System.out.println(x[0]); //0

        Note:- Whenever we are trying to print any reference variable internally toString() method will
               be called which is implemented by default to return the String in the following form:
               "ClassName @ Hashcode in Hexadecimal Form".


       //Example 2:

        int[][] x1 = new int[2][3];
        System.out.println(x1);        //[[I@4554617c
        System.out.println(x1[0]);     //[I@74a14482 ->One Dimensional Array Reference i.e. x1[0][0]
        System.out.println(x1[0][0]);  //0


       //Example 3:

        int[][] x2 = new int[2][];
        System.out.println(x2);         //[[I@1540e19d
        System.out.println(x2[0]);      //null
        System.out.println(x2[0][0]);   //Run Time Exception : java.lang.NullPointerException


        Note: If we are trying any operation on null then we will get Run Time Exception saying  NullPointerException


     =>Once we creates an array every Array element by default initialized with default values , If we are not
       satisfied with default values then we can override these values with our customized values.

        //Example 4:

        int[] a = new int[6];
        a[0] = 10 ;
        a[1] = 20 ;
        a[2] = 30 ;
        a[3] = 40 ;
        a[4] = 50 ;
        a[5] = 60 ;


        a[6] = 70;    //Run Time Exception : ArrayIndexOutOfBoundsException
        a[-6] = 80;   //Run Time Exception : ArrayIndexOutOfBoundsException
        a[2.5] = 90 ; //Compile Time Error : PLP : Incompatible Types : Found : Double ,Required : int

        PLP = Possible Loss Of Precision


        Note : If we are trying to access the array element with out of range index(Either positive or negative int value) then
        we will get Run Time Exception Saying ArrayIndexOutOfBoundsException


     */
}
