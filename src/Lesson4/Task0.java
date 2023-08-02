package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        int [][][] a = new int[2][2][2];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    a[i][j][k] = random.nextInt(10);
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
