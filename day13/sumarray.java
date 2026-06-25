package day13;
import java.util.Scanner;
public class sumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
            sum=sum+ar[i];

        }
        int avg=sum/num;
        System.out.println("sum and average of the given array is "+sum+" "+avg);
        
    }
    
}
