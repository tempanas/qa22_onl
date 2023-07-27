package Lesson4;


import java.util.Arrays;
import java.util.Random;

public class TwoAvg {
    public static void main(String[] args) {
        int avgarray1 = 0;
        int avgarray2 = 0;
        Random random = new Random();
        int array1[] = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        int array2[] = new int[5];
        for (int j = 0; j < array2.length; j++) {
            array2[j] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            avgarray1 += array1[i] / array1.length;
        }
        for (int j = 0; j < array2.length; j++) {
            avgarray2 += array2[j] / array2.length;
        }
        if (avgarray1 > avgarray2) {
            System.out.println("Average of array 1 is bigger: " + avgarray1 + " > " + avgarray2);
        } else if (avgarray1 < avgarray2) {
            System.out.println("Average of array 2 is bigger: " + avgarray2 + " > " + avgarray1);
        } else {
            System.out.println("Tha averages of these arrays are equal!" + avgarray1 + " = " + avgarray2);
        }
    }
}
