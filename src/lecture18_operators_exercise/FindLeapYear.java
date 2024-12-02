package lecture18_operators_exercise;

public class FindLeapYear {
    public static void main(String[] args) {
        // int year = 2023;
        int year = 2024;

        // divisible by 4 and NOT divisible by 100
        boolean isDivisibleBy4AndNotDivisibleBy100 = (year % 4 == 0) && (year % 100 != 0); // ex. true && true

        // divisible by 400
        boolean isDivisibleBy400 = year % 400 == 0;

        // find if any of these leap-year-conditions are true
        boolean isLeapYear = isDivisibleBy4AndNotDivisibleBy100 || isDivisibleBy400;

        System.out.printf("The year: %d is leap year: %b", year, isLeapYear);
    }
}
