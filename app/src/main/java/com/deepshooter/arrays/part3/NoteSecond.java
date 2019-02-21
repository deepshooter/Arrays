package com.deepshooter.arrays.part3;

public class NoteSecond {

    /*

    -------------------6.length vs length()---------------------

    length:

    length is a final variable applicable for Arrays.
    length variable represent the size of the Array.

    int[] x = new int[6];
    System.out.println(x.length()); : Compile Time Error : Cannot find symbol , symbol : method length() location :class int[]
    System.out.println(x.length); : Valid


    length():

    length() method is a final method applicable for String object.
    length() method returns number of character present in the String

     String s = "Avinash";
     //System.out.println(s.length); : Compile Time Error : cannot find symbol variable length , location : java.lang.String
     System.out.println(s.length());

     Note: length variable applicable for Arrays but not for String objects whereas length method applicable for
          String objects but not for Arrays.


    Example 3 :

    String[] string = {"A","AA","AAA"};

    System.out.println(string.length); //Valid : 3
    System.out.println(string.length()); // Not Valid : Compile Time Error
    System.out.println(string[0].length); Not Valid : Compile Time Error
    System.out.println(string[0].length()); //Valid : 1


     Example 4 :

     int[][] x1 = new int[6][3];
     System.out.println(x1.length); // 6
     System.out.println(x1[0].length); // 3

     In multidimensional array length variable represents only base size but not total size.
     There is no direct way to find total length of multidimensional array but indirectly we can find
     as follows:

     System.out.println(x1[0].length+x1[1].length+x1[2].length+x1[3].length+x1[4].length+x1[5].length);


     */
}
