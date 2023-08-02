package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class OddElements {
    public static void main(String[] args) {
        int a[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

