package day12;
  import java.util.Scanner;
public class funpalind {
  
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      palind(num);
   }

   static void palind(int num){
    int sum=reverse(num);
      if (sum==num)
        System.out.println("the given number is a palindrome");
    else
        System.out.println("the given number is not a palindrome");
       }

   static int  reverse(int num){
       int rev, sum=0;
    while(num>0){
        rev=num%10;
        sum=sum*10+rev;
        num/=10;

    }
    return sum;
   }
}
