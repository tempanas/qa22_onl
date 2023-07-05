package Lesson2;

import java.util.Scanner;

public class Seasonelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 69 || month == 10 || month == 11) {
            System.out.println("Fall");
        } else System.out.println("There is no such month in a year");

    }
}
