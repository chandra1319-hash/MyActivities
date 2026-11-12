package M1.JavaLesson3;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");
        int m = sc.nextInt();
        System.out.print("Your Grade is: ");
        if (m > 90) {
            System.out.println("O");
        } else if (m > 80 && m <= 90) {
            System.out.println("A+");
        } else if (m > 70 && m <= 80) {
            System.out.println("A");
        } else if (m > 60 && m <= 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        sc.close();
    }
}
