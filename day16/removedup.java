import java.util.Arrays;
import java.util.Scanner;

public class removedup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n;
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
          for(int i=0;i<num;i++){
            
            for(int j=i+1;j<num;j++){
                if(ar[i]==ar[j]){
                    n=(int)(Math.random()*100);
                    if(ar[j]==n)
                        n=0;
                    else
                        ar[j]=n;
                }
          }
          }
           System.out.println(Arrays.toString(ar));

               
    }

   

    
}
