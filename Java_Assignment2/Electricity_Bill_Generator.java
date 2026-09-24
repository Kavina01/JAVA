package Java_Assignment2;
import java.util.Scanner;
public class Electricity_Bill_Generator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Consumer Name");
        String Name = sc.nextLine();
        System.out.println("Enter Units Consumed");
        double Consumed = sc.nextDouble();;

        double Current_Bill = Consumed * 8;
        double Tax = Current_Bill * 0.18;
        double Payable_amount = Current_Bill + Tax;

        System.out.println("Consumer Name :" + Name);
        System.out.println("Units Consumed :" + Consumed);
        System.out.println("Current Bill : ₹" + Current_Bill);
        System.out.println("Tax : ₹" + Tax);
        System.out.println("Total Payable : ₹"+ Payable_amount);
    }
}
