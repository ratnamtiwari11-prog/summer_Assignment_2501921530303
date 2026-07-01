package day21;

import java.util.Scanner;

public class countVandC {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vow=0,con=0;
        System.out.println("enter a string");
        String str=sc.nextLine();
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                vow++;
            else
                con++;
            

        }
        System.out.println("no of vowels and consonants present in a given string is "+vow+" and "+con);
        
     }
    
}
