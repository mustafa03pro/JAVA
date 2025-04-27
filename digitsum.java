public class digitsum {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int t1=num%10;
        num=num/10;
        int t2=num;


        System.out.println("the digit sum is"+(t1+t2));
    }
    
}
