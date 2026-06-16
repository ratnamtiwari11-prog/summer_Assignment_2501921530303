package day7;
import java.util.Scanner;
public class recsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         int store= sum(num);
       System.out.println("the sum of digit is ="+store);
       

    } 
    static int sum(int num){
        if (num==0)
            return 0;
        else {

            return ((num%10)+ sum(num/10));
            
    }

    
}
}
