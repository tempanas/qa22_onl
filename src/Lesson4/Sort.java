package Lesson4;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {2, 4, 6, 8}, {9, 7, 5, 3}, {8, 6, 4, 2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i][j] > a[i][k]) {
                        int b;
                        b = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = b;
                    }
                }System.out.println(a[i][j] + " ");
            }
        }
    }
}
