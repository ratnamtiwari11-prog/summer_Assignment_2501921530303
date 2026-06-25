import java.util.Scanner;

class counter{
    public static void main( String[] args){
           Scanner sc =new Scanner(System.in);
           System.out.println("enter a number");
           int num=sc.nextInt();
           int count =0;
           
           while(num>0){
               num=num/10;
               count=count+1;
           }
           System.out.println("no of digit present in a given number is "+count);
           sc.close();
    }
}