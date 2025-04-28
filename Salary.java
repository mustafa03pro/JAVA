public class Salary{
    public static void main(String[] args) {
        int salary=Integer.parseInt(args[0]);
        double hrs=0.15;
        double basic=0.15;
        double convenens=0.1;
        double totalHrs=salary*hrs;
        double totalBasic=salary*basic;
        double totalConve=salary*convenens;
        double totalSalary=totalBasic+totalConve+totalHrs+salary;
        System.out.println("the total salaery"+totalSalary);
    }
}