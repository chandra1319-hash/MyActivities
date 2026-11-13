package M1.JavaLesson5;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char ch;

        do
        {
            System.out.print("Enter the number ");
            n = sc.nextInt();

            if(n > max)
            {
                max = n;
            }

            if(n < min)
            {
                min = n;
            }

            System.out.print("Do you want to continue y/n? ");
            ch = sc.next().charAt(0);

        }while(ch=='y' || ch == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        sc.close();
    }
}
