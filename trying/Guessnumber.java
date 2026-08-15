package trying;
import java.util.Scanner;
public class Guessnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Guess Number");
        int guess_number = sc.nextInt();

        int Secret_Number = 9;

        if(guess_number > Secret_Number)
        {
            System.out.println("Your Guess is higher");
        }
        else if(guess_number < Secret_Number)
        {
            System.out.println("Your Guess is lower");
        }
        else if(guess_number == 9)
            System.out.println("YOU WON");
    }
}
