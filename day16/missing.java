import java.util.Scanner;
public class missing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         for(int i=0 ; i<num; i++){
            if(ar[i] !=(i+1))
                System.out.println("the missing number is "+(i+1));

        }
    }

}