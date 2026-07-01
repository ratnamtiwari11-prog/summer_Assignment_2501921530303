package day18;
 import java.util.Scanner;
import java.util.Arrays;
public class selectionsort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int temp=0;
       int store,store1=0;
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         System.out.println("array is arranged in ascending order");
         for(int i=0;i<num;i++){
            temp=ar[i];
            for(int j=i+1;j<num-1;j++){
                if(ar[j]<temp){
                   temp=ar[j];
                    store1=j;
                }
            }
            
            store=ar[i];
            ar[i]=ar[store1];
            ar[store1]=store;
         
    }
                System.out.println(Arrays.toString(ar));  
         
        }
    
}
