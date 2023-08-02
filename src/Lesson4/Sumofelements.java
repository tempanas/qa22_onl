package Lesson4;

public class Sumofelements {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 5}, {2, 4, 6}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += sum + a[i][j];
            }
        }
        System.out.println(sum);
    }
}

