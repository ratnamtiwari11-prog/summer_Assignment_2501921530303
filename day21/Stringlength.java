package day21;
import java.util.Scanner;
public class Stringlength {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
       char[] ch=s.toCharArray();
      int count=0;
       for(char c: ch){
           count++;
       }
       System.out.println("length of the given string is "+count);
    }
    
}
