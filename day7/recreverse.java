package day7;
import java.util.Scanner;
import java.util.Scanner;

public class recreverse {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         int store= reverse(num,0);
       System.out.println("the reverse of given numbers is ="+store);
    
   }
      static int reverse(int num,int rev){
        if(num==0)
            return rev;
        else
            return reverse(num/10,rev*10+num%10);
      }
}
