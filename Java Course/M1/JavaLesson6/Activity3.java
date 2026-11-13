package M1.JavaLesson6;

import java.util.Scanner;

public class Activity3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int low = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int high = sc.nextInt();

        for(int n = low; n <= high; n++){
            if (n <= 1) continue; // 0 and 1 are not prime

            int count = 0;
            for(int div = 2; div < n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
        sc.close();
    }
}
