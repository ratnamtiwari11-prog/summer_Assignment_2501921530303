package day11;
import java.util.Scanner;
public class funmax {
 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
       int num2=sc.nextInt();
       max( num1, num2);
    }
    static void max(int a,int b){
        if (a>b)
            System.out.printf("%d is greater than %d",a,b);
        else
             System.out.printf("%d is greater than %d",b,a);
    }

}