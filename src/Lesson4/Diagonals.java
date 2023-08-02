package Lesson4;

public class Diagonals {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {2, 4, 6, 8}, {9, 7, 5, 3}, {8, 6, 4, 2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.println(a[i][j] + " ");
                }
            }
        }
    }
}