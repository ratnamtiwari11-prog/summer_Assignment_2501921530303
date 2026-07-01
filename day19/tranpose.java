package day19;
import java.util.Scanner;
import java.util.Arrays;
public class tranpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    
       
        System.out.println("enter no of rows in a matrix");
        int row=sc.nextInt();
          System.out.println("enter no of column in a matrix");
        int col=sc.nextInt();
       
        System.out.println("enter elements in matrix ");
         int[][] ar=new int[row][col];
        for(int i=0 ; i<row; i++){
             for(int j=0 ; j<col; j++){
            ar[i][j]=sc.nextInt();
    
         }
        }
        int[][] ar2=new int[col][row];
         for(int i=0 ; i<row; i++){
             for(int j=0 ; j<col; j++){
                ar2[j][i]=ar[i][j];
             }
            }
        System.out.println(Arrays.deepToString(ar2));
    }
    
}
