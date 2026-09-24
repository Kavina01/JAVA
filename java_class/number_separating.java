package java_class;
import java.util.Scanner;
public class number_separating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while(num != 0)
        {
            System.out.println(num%10);
            num /=10;
        }
    }
}
