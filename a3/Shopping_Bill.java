package a3;
import java.util.Scanner;
public class Shopping_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String name = sc.nextLine();
        System.out.println("Quantity Of Rice(kg)");
        int rice = sc.nextInt();
        System.out.println("Quantity Of Sugar(kg)");
        int sugar = sc.nextInt();
        System.out.println("Quantity Of Oil(litre)");
        int oil = sc.nextInt();

        //  rice  : ₹58kg
        //  sugar : ₹45kg
        // oil : ₹180/litre

        double rice_cost = rice * 58;
        double sugar_cost = sugar * 45;
        double oil_cost = oil * 180;
        double total_bill = rice_cost + sugar_cost + oil_cost;

        System.out.println("Customer :" + name);
        System.out.println("Rice :₹" + rice_cost);
        System.out.println("Sugar :₹" + sugar_cost);
        System.out.println("Oil :₹" + oil_cost);
        System.out.println("Total Bill :₹" + total_bill);
    }
}