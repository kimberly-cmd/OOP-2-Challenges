package Java2.CodingChallenge;

import java.util.Scanner;

public class Choices {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the student's name: ");
            String name = scanner.next();

            System.out.println("Enter the student's marks: ");
            int grade = scanner.nextInt();

            if (grade >80) {
                System.out.println(name + "'s grade is A");
            } else if (grade > 70) {
                System.out.println(name + "'s grade is B");
            } else if (grade > 60) {
                System.out.println(name + "'s grade is c");
            } else if (grade > 50) {
                System.out.println(name + "'s grade is D");
            } else if (grade > 40) {
                System.out.println(name + "'s grade is E");
            } else if (grade <= 39) {
                System.out.println(name + "'s grade is F");
            }else {
                System.out.println(name + "has failed");
            }


        }
    }
