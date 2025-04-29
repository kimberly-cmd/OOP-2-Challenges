package Java2.CodingChallenge;
import java.util.Scanner;

public class DrivingSchoolApplication {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age > 18) {
          System.out.println("You can apply for a driving license");
        } else {
            System.out.println("You are not eligible for a driving license");
        }
    }
}
