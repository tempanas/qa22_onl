package Lesson2;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7:");
        int color = scanner.nextInt();
        String res;
        switch (color){
            case 1:
                res = "Red";
                break;
            case 2:
                res = "Orange";
                break;
            case 3:
                res = "Yellow";
                break;
            case 4:
                res = "Green";
                break;
            case 5:
                res = "Blue";
                break;
            case 6:
                res = "Dark blue";
                break;
            case 7:
                res = "Violet";
                break;
            default:
                res = "Only numbers from 1 to 7 are allowed!";
        }
        System.out.println(res);
    }
    }
