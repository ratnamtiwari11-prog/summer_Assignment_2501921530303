
import java.util.Scanner;

public class conversion2 {
    public static void main(String[] args) throws IOException {

    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     PrintWriter pw = new PrintWriter(System.out);
    //    StringTokenizer st = new StringTokenizer(br.readLine());
    //    int n = Integer.parseInt(st.nextToken());
    //    cin>>n;
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int c=0,sum=0,rem,temp;
        double keep,sum1=0;
        
        int counter=0;
        
        if(s.contains(".")){
            String[] part=s.split("\\.");
            int whole=Integer.parseInt(part[0]);
            int decimal=Integer.parseInt(part[1]);


            while(whole>0){

                rem=whole%10;
                if(rem>1){
                    counter++;
                    break;
                }
                else{
                temp=(int)Math.pow(2,c);
                sum=sum+(rem*temp);
                whole=whole/10;
                c++;
                }
            }
            temp=0;rem=0;
          // int pos = 1;

                String up;

               while(decimal > 0){
                  rem = decimal % 10;
                  up=decimal+"";
                   if(rem>1){
                    counter++;
                    break;
                }
                else{
                   sum1 += rem * (1.0 / Math.pow(2, up.length()));
                  
                 decimal /= 10;

               }
            }
            

             if (counter==0) 
              System.out.println("the given binary to decimal conversion is "+(sum+ sum1));
            else
            System.out.println("invalid input");

        }
        else{
            int whole=Integer.parseInt(s);
             while(whole>0){
                rem=whole%10;
                 if(rem>1){
                    counter++;
                    break;
                }
                else{
                temp=(int)Math.pow(2,c);
                sum=sum+(rem*temp);
                whole=whole/10;
                c++;
            }
        }
        if (counter==0)
            System.out.println("the given binary to decimal conversion is "+sum);
          else
            System.out.println("invalid input");
        }
    }
    
    
}
