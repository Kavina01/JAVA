package java_class;
import java.util.Scanner;
public class Palindrone_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check palindrone or not");
        int num = sc.nextInt();
        int temp = num;

        int rev = 0;
        while(num != 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        num = temp;

        System.out.println(num);
        System.out.println(rev);

        if(num == rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}