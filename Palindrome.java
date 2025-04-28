import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(x);
        int t=1;
        int digit=1;
        //int original=a;
        //int reserved=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no: ");
        int a=sc.nextInt();
        int original=a;
        int reserved=0;
        //System.out.println(a);
        while (a>0) {
            digit=a%10;
            reserved=reserved*10+digit;
            
            t++;
            a=a/10;


            
        }
        
        if(original==reserved){
            System.out.println("palindrome "+ original);

        }
        else{
            System.out.println("not a palindrome"+original);
        }


    }
    
}
