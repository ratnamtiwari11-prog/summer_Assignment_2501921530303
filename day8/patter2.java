package day8;

public class patter2 {
    public static void main(String[] args) {
        char ch='A';
        for (int i=0; i<=4; i++){
            ch='A';
            for(int j=0;j<=i;j++){
                 
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
         }

    }
    
}
