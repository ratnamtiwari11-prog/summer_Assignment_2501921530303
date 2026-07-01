package day20;

import java.util.Scanner;
import java.util.Arrays;

public class multiplymatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       
        System.out.println("enter no of rows in a matrix1");
        int row1=sc.nextInt();
          System.out.println("enter no of column in a matrix1");
        int col1=sc.nextInt();
        System.out.println("enter elements in matrix 1");
         int[][] ar1=new int[row1][col1];
        for(int i=0 ; i<row1; i++){
             for(int j=0 ; j<col1; j++){
            ar1[i][j]=sc.nextInt();
    
         }
        }
         System.out.println("enter no of rows in a matrix 2");
        int row2=sc.nextInt();
          System.out.println("enter no of column in a matrix 2");
        int col2=sc.nextInt();
         System.out.println("enter elements in matrix 2");
         int[][] ar2=new int[row2][col2];
        for(int i=0 ; i<row2; i++){
             for(int j=0 ; j<col2; j++){
            ar2[i][j]=sc.nextInt();
    
         }
        }
        int[][] mat=new int[row2][col1];

        if(row2==col1){

            for(int i=0 ; i<row1; i++){
             for(int j=0 ; j<col2; j++){
                for(int k=0;k<row2;k++)
                    mat[i][j]=mat[i][j]+(ar1[i][k]*ar2[k][j]);
             }
            }

        }
        System.out.println(Arrays.deepToString(mat));
    }
    
}
