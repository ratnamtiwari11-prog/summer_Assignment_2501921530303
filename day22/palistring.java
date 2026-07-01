package day22;

import java.util.Scanner;

public class palistring {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if(rev.equals(str))
            System.out.println("given string is a palindrome");
        else
            System.out.println("given string is not a palindrome");
    }
    
}
