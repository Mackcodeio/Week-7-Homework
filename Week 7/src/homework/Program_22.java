package homework;

import java.util.Arrays;

// 22. Write a Java program to calculate the average value of array elements.
public class Program_22 {
    public static void main(String[] args) {
        new Program_22().avgOfArray();
    }

    public void avgOfArray(){
        int[] number = {59, 43, 22, 76 ,9, 19,77, 47};

        System.out.println("List of Array Number: "+Arrays.stream(number));
        int sum = Arrays.stream(number).sum();
        int average = sum/number.length;

        System.out.println("Sum of Array: "+Arrays.stream(number).sum());
        System.out.println("Avarage of list of Arrays: "+average);
    }

}
