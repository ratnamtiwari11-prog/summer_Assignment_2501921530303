package day10;

public class numpyramid {
     public static void main(String[] args){
       int store =1;
           
        for (int i=1; i<=5;i++){
            for(int j=5;j>=i;j--){
             
            System.out.print(" ");
              

           }
           int l=1;
          for(int k=2;k<=i;k++){
            
            System.out.print(l);
            l++;
          }
         
         
            store=1;
           for(int m=2;m<=i;m++){
            store=store*10+m;
             
             
           }
          
        System.out.print(reverse(store));


   
       /
        
         System.out.println();
          }
     }
    static int reverse(int num){
         int sum=0;
        while(num>0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        return sum;
     }
}

    

