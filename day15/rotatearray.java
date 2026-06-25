package day15;
import java.util.Scanner;
import java.util.Arrays;
public class rotatearray {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         int temp=ar[0];
           for(int i=0;i<num-1;i++){
           ar[i]=ar[i+1];

           }
           ar[num-1]=temp;
           System.out.println(Arrays.toString(ar));
    
      }
   }