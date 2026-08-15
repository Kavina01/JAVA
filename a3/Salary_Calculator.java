package a3;
import java.util.Scanner;
public class Salary_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name :");
        String Name = sc.nextLine();
        System.out.println("Enter The Basic Salary :");
        double Basic_Salary = sc.nextDouble();

        double HRA = 0.20 * Basic_Salary;
        double DA = 0.10 * Basic_Salary;
        double PF = 0.05 * Basic_Salary;
        double Net_Salary = Basic_Salary+HRA+DA-PF;

        System.out.println("Enter Employee Name :" +Name);
        System.out.println("Enter The Basic Salary :" + Basic_Salary);
        System.out.println("HRA : ₹" + HRA);
        System.out.println("DA : ₹" + DA);
        System.out.println("PF : ₹" + PF);
        System.out.println("Net_Salary : ₹"+ Net_Salary);
    }
}
