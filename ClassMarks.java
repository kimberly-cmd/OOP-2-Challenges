package Java2.CodingChallenge;
import java.util.Scanner;

public class ClassMarks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int marks;

        System.out.println("How many students' marks do you want to enter?: ");
        int noOfStudents = scanner.nextInt();

        int i = 0;

        while (i < noOfStudents) {
            System.out.println("Name: ");
            name = scanner.next();
            System.out.println("Marks: ");
            marks = scanner.nextInt();
            i++;
        }
    }
}
