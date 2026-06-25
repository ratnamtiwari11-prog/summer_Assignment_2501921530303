 import java.util.Arrays;
import java.util.Scanner;
public class merge{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,m;
        int a=0, b=0;
        System.out.println("enter size of first array" );
        n=sc.nextInt();
        int[] ar1=new int[n];
         System.out.println("enter elements in first array" );

         for(int i=0;i<n;i++){
            ar1[i]=sc.nextInt();
         }
        System.out.println("enter size of second  array" );
         m=sc.nextInt();
           int[] ar2=new int[m];
         System.out.println("enter elements in second array" );

            for(int i=0;i<m;i++){
            ar2[i]=sc.nextInt();
         }
         int[] merge=new int[n+m];
         int i=0;
         for( i=0;i<(n+m);i++){
            if(a<n && b<m){
            if(ar1[a]<ar2[b]){
            merge[i]=ar1[a];
            
            a++;
            }

            else{
            merge[i]=ar2[b];
            
            b++;
            }
         }
         else
            break;
      }
     
       while(a<n){
         merge[i++]=ar1[a++];
       }
      while(b<m){
         merge[i++]=ar2[b++];
      }
        System.out.println(Arrays.toString(merge));
    }
    
    
}
