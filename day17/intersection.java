
import java.util.Scanner;

import java.util.Arrays;

public class intersection {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,k=0;
        
        System.out.println("enter the size of first array");
        int num1=sc.nextInt();
        
         int[] ar1=new int[num1];
        for(int i=0 ; i<num1; i++){
            ar1[i]=sc.nextInt();
        }

         System.out.println("enter the size of second array");
        int num2=sc.nextInt();
        
         int[] ar2=new int[num2];
        for(int i=0 ; i<num2; i++){
            ar2[i]=sc.nextInt();
        }
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                if(ar1[i]==ar2[j])
                    count++;
            }
        }
        int[] intersect=new int[count];
         for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                if(ar1[i]==ar2[j])
                 intersect[k++]=ar1[i];   
            }
        }
         System.out.println("intersection elements are "+Arrays.toString(intersect));
    }

    
}

    

