package day24;

import java.util.Scanner;

public class duplicateremoval {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String s="";
        System.out.println("enter a string");
        String str=sc.nextLine(); 
       
       boolean[] check=new boolean[str.length()];
       
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                char ch1=str.charAt(j);
                if(i==j || check[i]==true){
                    continue;
                }
                else{
                if(ch==ch1){
                    
                    check[j]=true;
                }
            }
            }
            if(check[i]==false){
                s=s+ch;
                
            }
             

            }
          
       System.out.println(s);
    }  
}
