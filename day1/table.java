import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=1;x<11;x++)
        {
            System.out.println(n+"x"+x+"="+(n*x));
        }
    }
}
