package day13;
import java.util.Scanner;
public class countarary {
     
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int even=0, odd=0;
      
        int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         for(int i=0 ; i<num; i++){
            if (ar[i]%2==0)
               even++;
            else 
               odd++;
    
}
System.out.printf("no. of even =%d"+ "\n"+"no. of odd elemnts =%d ",even,odd);
     }
}
