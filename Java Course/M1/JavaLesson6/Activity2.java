package M1.JavaLesson6;

import java.util.Scanner;

public class Activity2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        for(int div = 2; div < n; div++){
            while(n % div == 0){
                n = n / div;
                System.out.print(div + " ");
            }
        }
        if(n != 1){
            System.out.print(n);
        }
        sc.close();
    }
}
