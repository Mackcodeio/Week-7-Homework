package homework;

import java.util.Scanner;
/*

    1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
       operator (? :)

* */
public class Program_1 {

    public static void main(String[] args) {
        new Program_1().EvenOdd();
    }

    public void EvenOdd(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any numeric number: ");

        //        while(!sc.hasNextInt() || (sc.nextInt() < 0) || (sc.nextDouble() < 0.0)){
        while(!sc.hasNextInt()){

            System.out.println("Invalid Entry");
            System.out.println("Please Enter only numeric digit number");
            System.out.println("-------------------------------------------------");
            sc.next();
        }

        int number= sc.nextInt();
        String msg = (number % 2 == 0) ? "The '"+number+"' is even number." : "The '"+number+"' is odd number";
        System.out.println(msg);
    }
}
