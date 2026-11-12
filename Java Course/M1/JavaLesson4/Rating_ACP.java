package M1.JavaLesson4;

import java.util.Scanner;

public class Rating_ACP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for movie details
        System.out.print("Enter Movie Title: ");
        String movieTitle = sc.nextLine();

        System.out.print("Enter Movie Rating (out of 10): ");
        int rating = sc.nextInt();

        System.out.print("The Movie is: ");
        if (rating >= 8) {
            System.out.println("Masterpiece");
        } else if (rating >= 6.0) {
            System.out.println("Good / Recommended");
        } else if (rating >= 3.0) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }

       sc.close();
    }
}
