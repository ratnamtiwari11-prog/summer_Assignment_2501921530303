package day15;
import java.util.Scanner;
import java.util.Arrays;
public class rotatearray2 {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         int temp=ar[num-1];
           for(int i=num-1;i>0;i--){
           ar[i]=ar[i-1];

           }
           ar[0]=temp;
           System.out.println(Arrays.toString(ar));
    
      }
   }

    

