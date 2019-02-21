package com.deepshooter.arrays.part4;

public class Note {

    /*

      ------------------9.Array Variable Assignments--------------------

      Case 1 : Element level promotions are not applicable at Array level. For Example : char element
      can be promoted to int type whereas char[] ( char Array ) can not be promoted to int[] (int Array)

      Example : 1

      int[] x   = {10,20,30,40};
      char[] ch = {'a','b','c','d'};

      int[] b = x;  //Valid
      int[] c = ch; //Not Valid : Compile Time Error : Incompatible Types Found : char[] , Required :int[]


      Which of the following promotions will be performed automatically :

      char     -> int       //Valid
      char[]   -> int[]     //Not Valid
      int      -> double    //Valid
      int[]    -> double[]  //Not Valid
      float    -> int       //Not Valid
      float[]  -> int[]     //Not Valid
      String   -> Object    //Valid
      String[] -> Object[]  //Valid

      But in the case of Object type Arrays child class type array can be promoted to parent class
      type array

      Example : 2
      String[] s = {"A","B","C"};
      Object[] o = s;


     Case 2 : Whenever we are assigning one Array to another Array internal elements won't be cpoy ,
              just reference variable will be reassigned


     Example : 3

     int[] a1 = {10,20,30,40,50,60};
     int[] b1 = {70,80};

     a1 = b1;  //Valid
     b1 = a1;  //Valid


    Case 3 : Whenever we are assigning one Array to another Array the dimension must be match.
             For Example : In the place of one dimensional  int Array we should provide one dimensional
             int Array only . If we are  trying to provide any other dimension then we will get Compile
             Time Error.



    Example : 4

    int[][] a =new int[3][];

    a[0] = new int[4][3]; //Compile Time Error : Incompatible Types Found : int[][] , Required int[]

    a[0] = 10; //Compile Time Error : Incompatible Types Found : int , Required int[]

    a[0] = new int[2]; //Valid


   Note : Whenever we are assigning one Array to another Array both dimension and types must be matched but
          Sizes are not required to Match.



     */
}
