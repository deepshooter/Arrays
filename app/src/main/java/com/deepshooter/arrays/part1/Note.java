package com.deepshooter.arrays.part1;

public class Note {

    /*

      Agenda:

      1.Introduction
      2.Array Declaration
      3.Array Creation
      4.Array Initialization
      5.Array Declaration , Creation , Initialization in a single line
      6.length vs length()
      7.Anonymous Array
      8.Array Element Assignments
      9.Array Variable Assignments


      --------1.Introduction---------

     Definition : An Array is an Indexed Collection of Fixed Number of Homogeneous Data Elements.

     Tha main Advantage of Array  is We can represent Huge Number of values by using single variable
     so that readability of the code will be improved But the maine Disadvantage of array is Fixed in
     size i.e. Once we creates an Array there is no chance of increasing or decreasing the size based
     on our requirement Hence to use Arrays concept compulsory we should know the size in Advanced,which
     may not possible always.



     --------2.Array Declaration--------

     1.One Dimensional Array Declaration

      int[] x;   //Valid : Recommended : Because Name is clearly separated from Type
      int  []x;  //Valid
      int  x[];  //Valid


      At the time of declaration we can not specify the size otherwise we will get compile time error.
      int[6] x; //Compile Time Error
      int[] x; //Valid


     2.Two Dimensional Array Declaration

     int[][]  x;   //Valid
     int  [][]x;   //Valid
     int   x[][];  //Valid

     int[]   []x;  //Valid
     int[]   x[];  //Valid
     int   []x[];  //Valid


     Which of the followings are Valid :

     int[]  a,b ;     //a->1D , b->1D //Valid
     int[] a[],b;     //a->2D , b->1D //Valid
     int[]  a[],b[] ; //a->2D , b->2D //Valid
     int[]  []a,b;    //a->2D , b->2D //Space will be ignored by Compiler //Valid
     int[]  []a,b[];  //a->2D , b->3D //Valid
     int[]  []a,[]b;  //Not Valid //Compile Time Error //If we want to specify dimension before the variable
                        that facility is applicable only for First variable in a declaration , If we are trying to
                        apply for remaining variable we will get Compile Time Variable

     int[]   []a,[]b,[]c; //Not Valid // Compile Time Error



    3.Three Dimensional Array Declaration

    int[][][]  a;  //Valid
    int  [][][]a;  //Valid
    int  a[][][];  //Valid
    int[]  [][]a;  //Valid
    int[]  a[][];  //Valid
    int[]  []a[];  //Valid
    int[][]  []a;  //Valid
    int[][]  a[];  //Valid
    int  [][]a[];  //Valid
    int  []a[][];  //Valid



     ---------- 3.Array Creation (1 Dimensional Array)------------

     Every Array in java is an object only , Hence we can create Arrays by using new Operator.

     int[]  a = new int[3]; //'a' is a reference variable

     For Every Array type corresponding classes are available and these classes are part of Java
     language and not available to the programmer level.

     int[] a1 = new int[3];
     System.out.println(a1.getClass().getName()); [I

     int[][] a2 = new int[3][2];
     System.out.println(a2.getClass().getName()); [[I


     boolean[] a3 = new boolean[3];
     System.out.println(a3.getClass().getName()); [Z



     Array Type      ||    Corresponding Class Name

     int[]                   [I
     int[][]                 [[I
     double[]                [D
     short[]                 [S
     byte[]                  [B
     boolean[]               [Z


     Loopholes Related to Array Creation :

     1.At the time of Array creation compulsory we should specify the size,otherwise we will get
       compile time error

     int[] x = new int[];  //Compile Time Error
     int[] x = new int[6]; //Valid


  2. It is legal to have an array with size 0 in Java.

     int[] x = new int[0]; //Valid

  3. If we are trying to specify Array Size with some negative int value then we will get Run Time Exception
     saying java.lang.NegativeArraySizeException

     int[] x = new int[-3]; //No Compile Time Error //But Run Time Exception : NegativeArraySizeException

  4. To specify array size the allowed data types are byte , short , char and int . If we are trying to specify
     any other type then we will get Compile Time Error

    int[] x = new int[10];  //Valid
    int[] x = new int['a']; //Valid

     byte b = 20;
    int[] x = new int[b]; //Valid

     short s = 30;
    int x = new int[s];  //Valid

    int x = new int[5l]; //Compile Time Error //Incompatible Type : Found : long required : int


   5.The Maximum allowed array size in java is 2147483647 which is the maximum value of int data type.

     int[] x = new int[2147483647];  //Valid //Memory Required : 2147483647 * 4 byte : //Out of memory error
     int[] x = new int[2147483648];  //Not Valid //Compile Time Error : Integer Number Too Large

    Even in the first case we may get Run Time Exception if sufficient Heap memory not available.
    //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit

     */

}
