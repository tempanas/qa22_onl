package Lesson2;

public class First10 {
    public static void main(String[] args) {
        int num = 0;
        do{
            System.out.println(num + " ");
            num+=-5;
        }
        while (num > -100); //не получается что-то придумать как вывести по количеству именно 10, т.е. сказать счетчику считать до 10
    }
}
