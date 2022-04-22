package day22_MultiDimensionalArray;

import java.util.*;

public class Deneme {//replit diagonal
    public static void main(String[] args) {

/*
                Scanner scan = new Scanner(System.in);
                int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                        {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
                int result = 0;

                int sum1 = matrix[0][0]+matrix[1][1]+matrix[2][2];
                int sum2 = matrix[0][2]+matrix[1][1]+matrix[2][0];

                result = sum1 - sum2;


*/
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()}};



        int result = 0;
        int diagr=0, diagl=0;
        for(int i=0;i<matrix[0].length;i++){
            diagr+=matrix[i][i];

        }
        for(int i=0,j=matrix[0].length-1;i<matrix[0].length;i++,j--){
            diagl+=matrix[i][j];
        }
        result=diagr-diagl;
        System.out.println(Math.abs(result));


                // FINAL PRINT
                System.out.println(Math.abs(result));
            }
        }