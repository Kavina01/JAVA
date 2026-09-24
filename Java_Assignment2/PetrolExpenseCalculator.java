package Java_Assignment2;
import java.util.Scanner;

public class PetrolExpenseCalculator {
    private static double Fuel_Requried;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Distance(km):");
        double Distance = sc.nextDouble();

        System.out.println("Enter Your Mileage(km/l):");
        double Mileage = sc.nextDouble();

        System.out.println("Enter Your Petrol Price:");
        double Price = sc.nextDouble();


        double Fuel_Required = Distance / Mileage;
        double Fuel_Cost = Fuel_Required * Price;


        System.out.println("Fuel_Required :" + Fuel_Required + "litres");
        System.out.println("Fuel_Cost : ₹" + Fuel_Cost);
    }
}