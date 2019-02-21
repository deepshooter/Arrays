package com.deepshooter.arrays.part3;

public class ExampleThree {

    public static void main(String[] args){

        //10,20,30,40,50
        sum(new int[]{10,20,30,40});
    }

    public static void sum(int[] x){

        int total = 0;

        for(int x1 : x){
            total = total + x1;
        }

        System.out.println("Total : "+total);
    }

    /*
       In the above example just to call sum() method we required an Array but after completing that sum()
       method call we are not using that Array anymore hence for this one time requirement Anonymous array is
       the best choice.

     */
}
