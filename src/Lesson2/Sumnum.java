package Lesson2;

import java.util.Scanner;

public class Sumnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a positive integer:");
        int num = scanner.nextInt();
        int sum = 0;
        if (num > 0){
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }System.out.println(sum);}
        else {
            System.out.println("Enter the number greater than 0!");
        }
    }
}

