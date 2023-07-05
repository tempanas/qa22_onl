package Lesson1;

import java.util.Scanner;

public class Namegame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name = scanner.next();
        System.out.println("Hi " + name);
    }
}
