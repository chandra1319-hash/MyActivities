package M1.JavaLesson3;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("Yes I'm Greater than 10");
        } else {
            System.out.println("Sorry I feel bad, I am not greater than 10");
        }

        sc.close();
    }
}

