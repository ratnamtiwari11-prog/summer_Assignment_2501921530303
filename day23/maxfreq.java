package day23;

import java.util.Scanner;

public class maxfreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int c=1;
        int keep=0;
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
                    c++;
                    check[j]=true;
                }
            }
            }
            if(temp<c){
                temp=c;
                keep=i;
            }
             c=1;

            }
            System.out.println("the max frequency no in the string of alphabet "+str.charAt(keep)+" is "+temp);
       
    }  
}

    


    

