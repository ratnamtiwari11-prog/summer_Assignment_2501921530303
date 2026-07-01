import java.util.Scanner;

public class pair {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
        }
        System.out.println("enter the target sum value");
        int target=sc.nextInt();
        
        for(int i=0;i<num;i++){
            
            for(int j=i+1;j<num;j++){
               
                    if((ar[i]+ar[j])==target){
                        System.out.println("the given pair is "+i+","+j);

                    }
                    
                    
                
                
            }
        }
    }
    
}
