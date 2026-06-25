package day13;
import java.util.Scanner;
public class findarary {
     
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      
        int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         int max=ar[0];
         int min=ar[0];
         for(int i=0 ; i<num; i++){
           if(max<ar[i])
            max=ar[i];
        if(min>ar[i])
            min=ar[i];
    
}
System.out.println( " the largest and the smallest number in array is "+max+" "+min);
     }
    }
