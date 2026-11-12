package M1.JavaLesson2;

public class LeapYear_ACP {
    public static void main(String[] args) {
        int year = 2024; // Example year to check
        String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "is a leap year." : "is not a leap year.";
        System.out.println(year + " " + result);
    }
}
