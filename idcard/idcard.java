package idcard;
import java.util.Scanner;
public class idcard {
    public static void main(String[] args){
        String name;
        int age;
        int year;
        String BG;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your year:");
        year = sc.nextInt();
        name = sc.nextLine();
        System.out.println("Enter your BG :");
        BG= sc.nextLine();
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Year:"+ year);
        System.out.println("BG:"+ BG);


    }
}
