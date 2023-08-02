package Lesson4;

import javax.swing.*;
import java.util.Scanner;

public class Isnumbermass {
    public static void main(String[] args) {
        int[] a = {3, 4, 7, 9, 5, 0, 2, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println("Good job! You guessed the number - it's in array.");
                break;
            }
            if (a[i] != num) {
                System.out.println("The number is outside the array. Try one more time!");
                break;
            }
        }
    }
}
