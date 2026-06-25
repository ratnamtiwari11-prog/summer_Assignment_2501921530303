package day15;
import java.util.Scanner;
import java.util.Arrays;
public class reverse {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         rev(ar,num);
    
}
static void rev(int[] ar,int num){
        int[] arr=new int[num];
        int j=num-1;
        for(int i=0;i<num;i++){
            arr[i]=ar[j];
            j--;
        }
        
            System.out.println(Arrays.toString(arr));

}
}
