package java_class;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num");
        int num = sc.nextInt();

        if(num < 0)
        {
            num = -num;
        }
        System.out.println("ABSOLUTE VALUE " + num);
    }

}
