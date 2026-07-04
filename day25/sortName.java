package day25;

import java.util.Arrays;
import java.util.Scanner;


public class sortName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] name=new String[n];
        for(int i=0;i<n;i++){
            name[i]=sc.next();

        }
        String temp="";
        int k=0;
        int l=0;
        for(int i=0;i<n-1;i++){
             k=0;
            l=0;
            char ch=name[i].charAt(k);
           
            for(int j=i+1;j<n;j++){
                
                 char ch1=name[j].charAt(l);
                 if(ch==ch1){
                        k++;
                        l++;
                 }
                 if(k<name[i].length() && l<name[j].length()){
                    if(ch==ch1){
                       
                        ch=name[i].charAt(k);
                        ch1=name[j].charAt(l);
                             j--;
                    }
                    else if(ch>ch1){
                       temp=name[j];
                       name[j]=name[i];
                       name[i]=temp;
                       k=0;
                       l=0;
                       ch=name[j-1].charAt(k);
                    }
                    else{
                                temp="";
                                k=0;
                                l=0;
                             ch=name[i].charAt(k);   
                    }
                    temp="";
                }
                else{
                
                if(name[i].length()>name[j].length()){
                    temp=name[j];
                       name[j]=name[i];
                       name[i]=temp;
                }
                    l=0;
                    k=0;
                }

                     
                  
            }

        }
         System.out.println(Arrays.toString(name));
    }

    
}
