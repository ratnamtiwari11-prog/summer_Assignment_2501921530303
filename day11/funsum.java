package day11;
import java.util.Scanner;
public class funsum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
       int num2=sc.nextInt();
       sum( num1, num2);

    }
   static void  sum(int a,int b){
        int total=a+b;
        System.out.println("sum of two numbers are "+total);
    }
    
}
