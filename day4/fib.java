package day4;

import java.util.Scanner;
public class fib {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
           int n=sc.nextInt();
           int r=0,r1=0,r2=1;
           if(n==1){
            System.out.println("nth term value is 0");
           }
           else if(n==2){
            System.out.println("nth term value is 1");
           }
            
          else{

           
           for(int i=3;i<=n;i++){
            r=r1+r2;
            r1=r2;
            r2=r;
           }
        
        System.out.println("nth term value of fibonacci series is "+r);
          }
    }
}
