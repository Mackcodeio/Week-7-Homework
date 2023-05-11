package homework;

import java.util.Arrays;

// 20. Write a Java program to sort a numeric array and a string array.
public class Program_20 {

    public static void main(String[] args) {
        new Program_20().sortArray();
    }

   public void sortArray(){
       int[] number = {59, 43, 22, 76 ,9, 19,77};

       String[] countryName = { "Japan", "India", "USA", "Argentina", "Brazil", "Canada"};

       System.out.println("Original numeric array : "+Arrays.toString(number));
       Arrays.sort(number);
       System.out.println("Sorted numeric array : "+Arrays.toString(number));

       System.out.println("Original string array : "+Arrays.toString(countryName));
       Arrays.sort(countryName);
       System.out.println("Sorted string array : "+Arrays.toString(countryName));
    }

}

