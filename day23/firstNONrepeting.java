package day23;

import java.util.Scanner;

public class firstNONrepeting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine(); 
       int c=1;
       
        for(int i=0;i<str.length();i++){
            c=1;
             char ch=str.charAt(i);
             for(int j=0;j<str.length();j++){
                if(i==j)
                    continue;
                else{
             char ch1=str.charAt(j);
            if(ch==ch1)
                c++;
        }
    }
        if(c==1){
            System.out.println("first non repeating charater in string is "+ch);
            break;
        }
        
        }
        if(c>1)
            System.out.println("their is not any non repeating charater in the string  ");
    }

    
}
