package day26;
import java.util.Random;
import java.util.Scanner;
public class guessTHeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       Random random=new Random();
       int r=random.nextInt(100)+1;
       boolean check=false;
       int c=1;
       while(check!= true) { 
        System.out.print("enter a number ");
        int number=sc.nextInt();
          // System.out.print("\n");
        if(number ==r){
            check=true;
            break;
        }
        else if(number> r){
            System.out.println("too high");


        }
        else
            System.out.println("too low");

        c++;
           
       }
       if(check==true){
        System.out.println("you got correct answer in "+c+" turns");
       }
        

    }
    
}
