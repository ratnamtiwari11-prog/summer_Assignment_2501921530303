package day24;

import java.util.Scanner;

public class stringrotation {
         public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char temp;
        System.out.println("enter a string");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
         temp=ch[0];
        for(int i=0;i<(str.length()-1);i++){
           ch[i]=ch[i+1];
        }
        ch[str.length()-1]=temp;
        int m=str.length();
        str="";
         for(int i=0;i<m;i++){
        str=str+ch[i];
         }
         System.out.println(str);
    }

    
}
