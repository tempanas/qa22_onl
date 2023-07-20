package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Tasknum0 {
    public static void main(String[] args) {
        int [][][] a = {{{0, 8}, {5, 0}, {1, 0}, {1, 5}}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, на которое хотите увеличить массив:");
        int num = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    a[i][j][k] += num;//добавляет только к первому элементу, а не ко всему массиву, решения не нашла пока
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
