package M1.JavaLesson3;

import java.util.Scanner;

public class Activity1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String str = sc.nextLine();
        System.out.println("Your Name is " + str);

        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        System.out.println("Number is " + num);

        System.out.print("Enter a floating number: ");
        float fnum = sc.nextFloat();
        System.out.println("The floating num is " + fnum);

        sc.close();
    }
}
