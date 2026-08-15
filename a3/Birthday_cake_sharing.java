package a3;
import java.util.Scanner;
public class Birthday_cake_sharing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cake Price");
        double price = sc.nextDouble();
        System.out.println("Number of Friends");
        int number = sc.nextInt();

       double Amount_Per_Friend = price / number;

       System.out.println("Cake Price : ₹" + price);
       System.out.println("Friends : " + number);
       System.out.println("Each Friend Should Pay : ₹" + Amount_Per_Friend);
    }
}
