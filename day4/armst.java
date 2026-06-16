package day4;
import java.util.*;
public class armst {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int c=0;
        int temp=num;
        int rem, arm=0;
        while(temp>0)
         {
              temp=temp/10;
              c++;
        
              
    }
    temp=num;
    while(temp>0){
        rem=temp%10;
        arm=arm+ (int)Math.pow(rem,c);
        temp=temp/10;
    }
    if (arm==num)
        System.out.println("the given number is an armstrong number");
    else {
        
        System.out.println("the given number is not an armstrong number");
    }
}
}
