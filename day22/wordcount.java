package day22;

import java.util.Scanner;

public class wordcount {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
       
       int count=0;
            if(str.contains(" ")){
                String[] parts=str.split(" ");
            
            for(int i=0; i<parts.length; i++){
                count=0;
                for(int j=0;j<parts[i].length();j++){
                    count++;
                    

                }
                System.out.println(parts[i]+" contains "+count+" words");

            }
        }
            
        }
}
