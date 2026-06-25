import java.util.Scanner;

public class maxfrequency {
   
     
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxfreq=0;
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        
         int[] ar=new int[num];
         int[] max=new int[num];
         boolean[] check=new boolean[num];
        for(int i=0 ; i<num; i++){
            ar[i]=sc.nextInt();
         }
        for(int i=0;i<num;i++){
            if(check[i]==true)
                continue ;
            int count=1;
            for(int j=i+1;j<num;j++){
                if(ar[i]==ar[j]){
                    count++;
                    check[j]=true;
                }
            }
            max[i]=count;  
        }
        int l=0;
        maxfreq=max[0];
        for( l=0;l<num-1;l++){
            if(max[l]>maxfreq)
                 maxfreq=max[l];
        }
        System.out.println("the max frequency of elements in given array is "+maxfreq);
     
     }
   
}

