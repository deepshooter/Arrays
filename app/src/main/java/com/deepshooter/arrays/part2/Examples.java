package com.deepshooter.arrays.part2;

public class Examples {

    public static void main(String[] args){

        //Example 1: //Array of Arrays

        int[][] x = new int[2][];
        x[0] = new int[2];
        x[1] = new int[3];

        //Example 2:

        int[][][] x1 = new int[2][][];

        x1[0] = new int[3][];
        x1[0][0] = new int[1];
        x1[0][1] = new int[2];
        x1[0][2] = new int[3];

        x1[1] = new int[2][2];

       //Which of the following Array declarations are valid:

        /*

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

        */

    }


}
