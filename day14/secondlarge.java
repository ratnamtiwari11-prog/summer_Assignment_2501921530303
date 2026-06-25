package day14;
import java.util.Scanner;
import java.util.Scanner;

public class secondlarge {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int max;
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
        max=ar[0];
        int j=0;
    for(int i=1;i<num;i++){
        
        if(max<ar[i])
            max=ar[i];
        j++;
    }
      ar[j]=0;
       max=ar[0];
      for(int i=1;i<num;i++){
            if(max<ar[i])
                max=ar[i];
      }
      System.out.println("second greatest number in array is "+max);


    }
}
