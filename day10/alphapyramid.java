package day10;

public class alphapyramid {
    
     public static void main(String[] args){
       int store =1;
           String s="";
        for (int i=1; i<=5;i++){
            for(int j=5;j>=i;j--){
             
            System.out.print(" ");
              

           }
           char ch='A';
          for(int k=2;k<=i;k++){
            
            System.out.print(ch);
            ch++;
          }
         
         
            ch='A';
           for(int m=1;m<=i;m++){
           s=ch+s;
             
             ch++;
           }
          
        System.out.print(s);
         s="";

   
       
        
         System.out.println();
          }
     }
     
}


    



