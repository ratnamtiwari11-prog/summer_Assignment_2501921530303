package day19;

import java.util.Scanner;
import java.util.Arrays;

public class addmatrix {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       
        System.out.println("enter no of rows in a matrix1");
        int row=sc.nextInt();
          System.out.println("enter no of column in a matrix1");
        int col=sc.nextInt();
        System.out.println("enter elements in matrix 1");
         int[][] ar1=new int[row][col];
        for(int i=0 ; i<row; i++){
             for(int j=0 ; j<col; j++){
            ar1[i][j]=sc.nextInt();
    
         }
        }
         System.out.println("enter no of rows in a matrix 2");
        int row1=sc.nextInt();
          System.out.println("enter no of column in a matrix 2");
        int col1=sc.nextInt();
         System.out.println("enter elements in matrix 2");
         int[][] ar2=new int[row1][col1];
        for(int i=0 ; i<row1; i++){
             for(int j=0 ; j<col1; j++){
            ar2[i][j]=sc.nextInt();
    
         }
        }
        int row2=(row>row1) ? row : row1 ;
        int col2=(col>col1) ? col : col1 ;
        int[][] sum=new int[row2][col2];
            for(int i=0 ; i<row2; i++){
             for(int j=0 ; j<col2; j++){ 
             int a = 0;
              int b = 0;

              if(i < row && j < col)
                   a = ar1[i][j];

                if(i < row1 && j < col1)
                  b = ar2[i][j];

                   sum[i][j] = a + b;
            }
          }
          System.out.println(Arrays.deepToString(sum));
    }

    
}
