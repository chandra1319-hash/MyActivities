package M1.JavaLesson6;

import java.util.Scanner;

public class Activity1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases (t): ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div< n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

             if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        sc.close();
    }
}
