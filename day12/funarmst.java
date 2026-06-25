package day12;
import java.util.Scanner;
public class funarmst {
     
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        armst(num);
      check(num);
    }
    static int digits(int num){
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c;
    }

    static int  armst(int num){
        int c=digits(num);
        int temp=num;
        int rem,arm=0;
        while(temp>0){
        rem=temp%10;
        arm=arm+ (int)Math.pow(rem,c);
        temp=temp/10;
    }
    return arm;

}
    static void check(int num){
        int sum=armst(num);
        
    if (sum==num)
        System.out.println("the given number is an armstrong number");
    else 
        
        System.out.println("the given number is not an armstrong number");
    

    }
}
