package day14;
import java.util.Scanner;
public class linearseach {
     
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         System.out.println("enter the element to be searched");
        int search=sc.nextInt();
         int j=1;
         for( int i=0 ; i<num; i++){
                if(ar[i]==search){
                        
                        x=1;
                       break;
                
                }
                 j++;      
    
           }
           if(x==1)
                 System.out.println("element found at index "+j);
                else
                        System.out.println("element is not found");
        }
}

