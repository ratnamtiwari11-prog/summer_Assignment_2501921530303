package day11;
import java.util.Scanner;
public class funprime {
 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       prime(num);
    
     }
     static void prime(int num){
        int count=0;
       for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
       }
       if (count==2)
        System.out.printf("%d number is a prime number",num);
    else
        System.out.printf("%d number is not a prime number",num);


        
     }

}
