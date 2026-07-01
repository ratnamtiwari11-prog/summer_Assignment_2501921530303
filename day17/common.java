 import java.util.Scanner;
public class common {

     
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
         boolean[] check=new boolean[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
    
         }
         System.out.println("common elements are");
        for(int i=0;i<num;i++){
            if(check[i]==true)
                continue ;
            
            for(int j=i+1;j<num;j++){
                if(ar[i]==ar[j]){
                    
                    check[j]=true;
                    System.out.println(ar[i]);
                }
            }
           
         
        }
     
     }
   
  
 
}

    

