import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int num=sc.nextInt();
        for (int x=num;x>0;x--) {
            fact=fact*x;
           
            
        }
             System.out.println("factorial of given number is "+fact);
             sc.close();
    }
    
}
