public class tax {
    public static void main(String[] args) {
        // final double tax=0.049;
        // double  amount=990000;
        // double total=amount*tax;
        double tax=Double.parseDouble(args[0]);
        double amount=Double.parseDouble(args[1]);
        double total=amount*tax;
        System.out.println("the total tax payable"+total);


    }
}
