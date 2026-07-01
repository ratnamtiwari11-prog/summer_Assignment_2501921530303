package day18;
import java.util.Scanner;
import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int temp=0;
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         System.out.println("array is arranged in ascending order");
         for(int i=0;i<num;i++){
            for(int j=i;j<num-1;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }

         }
         System.out.println(Arrays.toString(ar));
        
    }
    
}
