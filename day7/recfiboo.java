package day7;
import java.util.Scanner;
public class recfiboo {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int store= fiboo(num);
       System.out.println(store);
       

   }
   static int fiboo(int num){
    if (num==0 )
        return 0;
    if(num==1)
        return 1;

            return (fiboo(num-1)+fiboo(num-2));
        }
        
   }
    

