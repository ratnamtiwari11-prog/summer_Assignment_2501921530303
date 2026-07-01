package day20;
import java.util.Scanner;

public class Symmetricmatrix {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
       System.out.println("plzz enter same no of rows and cols");
       
        System.out.println("enter no of rows in a matrix");
        int row=sc.nextInt();
          System.out.println("enter no of column in a matrix");
        int col=sc.nextInt();
        if(row==col){
        System.out.println("enter elements in matrix ");
         int[][] ar=new int[row][col];
        for(int i=0 ; i<row; i++){
             for(int j=0 ; j<col; j++){
            ar[i][j]=sc.nextInt();
    
         }
        }
        
         for(int i=0 ; i<row; i++){
             for(int j=0 ; j<col; j++){
                if(ar[i][j]!=ar[j][i]){
                    c++;
                    break;
                }
            }
        }
        
        if(c==0)
            System.out.println("matrix is Symmetric ");
        else
             System.out.println("matrix is not Symmetric ");
    }
    else
             System.out.println("matrix is not Symmetric ");


    }
    
}

