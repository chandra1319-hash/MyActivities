package M1.JavaLesson6;
import java.util.Scanner;
public class RotateNum_ACP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to rotate: ");
        int n = sc.nextInt();
        System.out.print("Enter number of rotations (positive for right rotation, negative for left rotation): ");
        int k = sc.nextInt(); // Number of rotations (positive for right rotation)

        int temp = n;
        int digits = 0;

        // Step 1: Count the number of digits without using functions
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Step 2: Normalize k (handle k > digits or negative k)
        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }

        // Step 3: Compute 10^digits and 10^k using simple loops instead of Math.pow()
        int mult = 1;
        for (int i = 1; i <= digits; i++) {
            mult *= 10;
        }

        int div = 1;
        int remDiv = 1;
        for (int i = 1; i <= k; i++) {
            div *= 10;
        }
        for (int i = 1; i <= (digits - k); i++) {
            remDiv *= 10;
        }

        // Step 4: Rotate the number
        int rightPart = n % div;
        int leftPart = n / div;
        int rotatedNumber = (rightPart * remDiv) + leftPart;

        System.out.println("Original Number: " + n);
        System.out.println("Rotated Number by " + k + " places: " + rotatedNumber);
        sc.close();
    }
}
