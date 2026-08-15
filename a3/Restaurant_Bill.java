package a3;
import java.util.Scanner;
public class Restaurant_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantity Of Idly");
        int idly = sc.nextInt();
        System.out.println("Quantity Of Dosai");
        int dosai = sc.nextInt();
        System.out.println("Quantity Of Vadai");
        int vadai = sc.nextInt();

        //  idly  : ₹12
        //  dosai : ₹40
        // vadai : ₹10

        double idly_cost = idly * 12;
        double dosai_cost = dosai * 40;
        double vadai_cost = vadai * 10;
        double subtotal = idly_cost + dosai_cost + vadai_cost;
        double GST_Amount = subtotal * 0.05;
        double Grand_Total = subtotal + GST_Amount;


        System.out.println("Idly :₹" + idly_cost);
        System.out.println("Dosai :₹" + dosai_cost);
        System.out.println("Vadai :₹" + vadai_cost);
        System.out.println("Subtotal :₹" + subtotal);
        System.out.println("GST : ₹" + GST_Amount);
        System.out.println("Grand Total :₹" + Grand_Total);
    }
}