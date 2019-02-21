package com.deepshooter.arrays.part3;

public class NoteFour {

    /*

     ----------8.Array Element Assignments-------------

     Case 1 : In the case of primitives types array as arrays element we can provide any type
              which can be implicitly promoted to declared type

        Example : 1

        int[] x = new int[5];
        x[0] = 10;
        x[1] = 'a';

        byte b = 20;
        x[2] = b;

        short s = 30;
        x[3] = s;

        x[4] = 10l; Compile Time Error : PLP Found : lang , Required : int

        byte -> short-
                         -> int -> long -> float -> double
        char ---------


     In the case of float type arrays the allowed data types are :   byte - short - char - int -long-float


     Case 2 : In the case of object type arrays as Array elements we can provide either declared type objects
              or its child classes objects.


        Example : 2

        Object[] a = new Object[10];
        a[0] = new Object();
        a[1] = new String("Avinash");
        a[2] = new Integer(10);


        Example : 3

        Number[] n = new Number[10];
        n[0] = new Integer(10);
        n[1] = new Double(10.5);
        n[2] = new String("Avinash"); ; Compile Time Error : Incompatible Type , Found : java.lang.String , required java.lang.Number


        Number Child classes : byte , short , int ,long , float ,double



     Case 3 : For interface type arrays as Array elements its implementation class objects are allowed.

     Example : 4

     Runnable[] r = new Runnable[10];
     r[0] = new Thread();
     r[1] = new String(); Compile Time Error : Incompatible Type , Found : java.lang.String , required java.lang.Runnable


     Conclusion:


         Array Type                   ||   Allowed Element Type

        1.Primitives Types Arrays        We can provide any type which can be implicitly promoted to declared type

        2.Object Type Arrays             Either declared type or its child class objects

        3.Abstract Class Type Arrays     Its child class object (Number Example)

        4.Interface Type Arrays          Its implementation class objects are allowed




     */
}
