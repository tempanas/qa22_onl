package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Maxminaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size:");
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }
        System.out.println(Arrays.toString(a));
        double max = a[0];
        double min = a[0];
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            avg += a[i] / a.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
