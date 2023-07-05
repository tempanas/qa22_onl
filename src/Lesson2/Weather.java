package Lesson2;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which the weather is today? Enter the temperature:");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("It's warm!");
        } else if (-5 >= t && t > -20) {
            System.out.println("It's pretty cool!");
        } else if (-20 >= t) {System.out.println("It's really cold!");}

    }
}