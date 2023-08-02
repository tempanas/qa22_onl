package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFromKeyb {
    public static void main(String[] args) {
        int len = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        len = scanner.nextInt();
        if (5 <= len & len <= 10) {
            System.out.println("Good job! Let's move further");
        } else {
            System.out.println("Incorrect input! Please enter the number from 5 to 10!");
            len = scanner.nextInt();
        }
        int a[] = new int[len];
        Random random = new Random();
        int evennums = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            if (a[i] % 2 == 0) {
                evennums++;
            }
        }
        System.out.println(Arrays.toString(a));
        int b[] = new int[evennums];
        int indexa = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[indexa] = a[i];
                indexa++;
            }

        }System.out.println(Arrays.toString(b));
    }
}