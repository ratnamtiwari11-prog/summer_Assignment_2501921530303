package day25;
import java.util.Scanner;
import java.util.Arrays;
public class mergearr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of two array");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int[] ar1=new int[num1];
        int[] ar2=new int[num2];
 System.out.println("enter elements in first array");
        for(int i=0;i<num1;i++){
            ar1[i]=sc.nextInt();
        }
         System.out.println("enter elements in second array");
         for(int i=0;i<num2;i++){
            ar2[i]=sc.nextInt();
        }
        int[] merge=new int[num1+num2];
        int i=0,j=0,k=0;
            while(i<num1 && j<num2){
            if(ar1[i]<ar2[j]){
                merge[k++]=ar1[i++];
            }
            else
                merge[k++]=ar2[j++];
        }
        while(i<num1){
            merge[k++]=ar1[i++];
        }
        while(j<num2){
            merge[k++]=ar2[j++];
        }
                   System.out.println(Arrays.toString(merge));
    }
    
}
