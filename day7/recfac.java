package day7;
import java.util.Scanner;
public class recfac {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int store= fac(num);
       System.out.println(store);
       
    }
   static int  fac(int num){
        int temp=num;
      if(temp==1 || temp==1)
        return 1;
    else
        return (fac(temp-1) *temp);
    }
    
}
 
