package trying;
import java.util.Scanner;
public class ATMwithdraw {
    public static void main(String[] args){

        System.out.println("Enter Your Account Balance");
        Scanner sc = new Scanner(System.in);
        double Account_Balance = sc.nextDouble();

        System.out.println("Enter Your Withdraw Amount");
        double Withdraw_amount = sc.nextDouble();

        double Remaining_Balance = Account_Balance - Withdraw_amount;

        if(Remaining_Balance>=Withdraw_amount)
        {
            System.out.println("Withdraw Success");
            System.out.println("Remaining_Balance :" + Remaining_Balance);
        }
        else
        {
            System.out.println("Insufficient_Balance");
        }


    }
}
