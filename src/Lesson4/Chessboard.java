package Lesson4;


public class Chessboard {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if ((i + j) % 2 == 0) chessboard[i][j] = "W";
                else chessboard[i][j] = "B";
                System.out.print(chessboard[i][j] + " ");// но выводит некрасиво в столбик, не догадалась как вывести как матрицу, как ни пробовала
            }
        }
    }
}
