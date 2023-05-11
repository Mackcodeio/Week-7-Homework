package homework;

import java.util.Arrays;

// 21. Write a Java program to sum values of an array.

public class Program_21 {

    public static void main(String[] args) {
        new Program_21().sumOfArray();
    }

    public void sumOfArray(){
        int[] number = {59, 43, 22, 76 ,9, 19,77};

        int sum = Arrays.stream(number).sum();
        System.out.println("List of Arrays: "+Arrays.toString(number));
        System.out.println("Sum of Array: "+sum);
    }
}
