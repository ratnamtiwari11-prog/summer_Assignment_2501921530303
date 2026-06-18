package day11;

import java.util.Scanner;

public class funfact {
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        funfact obj=new funfact();
        obj.fact(num);
    }

     void fact(int num){
        int prod=1;

      for(int i=1; i<=num;i++){
         prod=prod*i;
      }
      System.out.println("factoial of the given number is "+prod);

          
    }
}

