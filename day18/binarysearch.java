package day18;

import java.util.Scanner;

public class binarysearch {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         System.out.println("enter the value to be searched");
         int target=sc.nextInt();
         int min=0;
         int max=num-1;
         int mid;
       while(min<=max){
            mid=(max+min)/2;
            if(target==ar[mid]){
                System.out.println("elements found");
            break;
            }
             else if(target<ar[mid]){
               max=mid-1;
            }
            else
               min=mid+1;

         }
    }
    
}
