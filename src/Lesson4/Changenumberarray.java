package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Changenumberarray {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number from 1 to 99:");
        int num = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                a[i] = 0;
                System.out.println("You guessed the number, so it was changed from " + num + " to 0.");
                break;
            }
            if (a[i] != num) {
                System.out.println("Ouch! You don't guess! Try one more time.");
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

