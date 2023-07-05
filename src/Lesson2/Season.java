package Lesson2;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month = scanner.nextInt();
        String res;
        switch (month) {
            case 1:
            case 2:
            case 12:
                res = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                res = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                res = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                res = "Fall";
                break;
            default:
                res = "There is no such month in a year";
        }
        System.out.println(res);
    }
}
