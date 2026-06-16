import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        
    int cc=(int)num;
    double deci=num-cc;
    
        String s=num+"";
        String sum1="";
       int rem,i=0;
       String sum="";
        if (s.contains(".")){
            String[] parts=s.split("\\.");
            String whole=parts[0];
            String decimal=parts[1];
            int wholenum=Integer.parseInt(whole);
            while(wholenum>0){
             rem=wholenum%2;
            wholenum=wholenum/2;
            sum=rem+sum;
            }
            // System.out.println("Whole part: "+sum);
            while(deci !=1.0 && i<6){
                deci=deci*2;
                int deciInt=(int)deci;
                if(deciInt==1){
                    sum1=sum1+"1";
                    deci=deci-1;
                } else {
                    sum1=sum1+"0";
                }
                i++;
            }
            System.out.println("the converted decimal into binary is "+sum+"."+sum1);

             
           // System.out.println("Whole part: "+whole);
           // System.out.println("Decimal part: "+decimal);
        }
         else {
            int wholenum=Integer.parseInt(s);
            while(wholenum>0){
             rem=wholenum%2;
            wholenum=wholenum/2;
            sum=rem+sum;
            }
            /// System.out.println("Whole part: "+sum);
            System.out.println("the converted decimal into binary is "+sum);
             
            // System.out.println("The number is an integer: "+s);

        }
        

    }
}