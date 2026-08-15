import java.util.Scanner;
public class marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Tamil:");
        int tamil = sc.nextInt();

        System.out.println("English:");
        int english = sc.nextInt();

        System.out.println("Maths:");
        int maths = sc.nextInt();

        System.out.println("Science:");
        int science = sc.nextInt();

        System.out.println("Social Science:");
        int social = sc.nextInt();

        int total = tamil + english + maths + science + social;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}