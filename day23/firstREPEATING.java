package day23;

import java.util.Scanner;

public class firstREPEATING {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine(); 
       int c=0;
       
        for(int i=0;i<str.length();i++){
            c=0;
             char ch=str.charAt(i);
             for(int j=0;j<str.length();j++){
                if(i==j)
                    continue;
                else{
             char ch1=str.charAt(j);
            if(ch==ch1){
                c++;
                break;
            }

        }
    }
        if(c==1){
            System.out.println("first repeating charater in string is "+ch);
            break;
        }
        
        }
        if(c==0)
            System.out.println("their is not any repeating charater in the string  ");
    }

    
}

    

