package day3;
import java.util.Scanner;


public class gcd {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num1=sc.nextInt();
      int num2=sc.nextInt();
      int rem, quant;
      
        while(num2!=0){
            rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        
      }
      
    
    System.out.println("the GCD value of two numbers are "+num1);
    sc.close();
    }

}
