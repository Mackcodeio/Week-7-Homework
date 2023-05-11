package homework;

import java.util.Scanner;

/*
    Write a java program to get numbers from users and print whether it is positive or negative.
* */
public class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number and I give back to you number is positive or nagative: ");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number");
            sc.next();
        }

        int number = sc.nextInt();
        if(number>0){
            System.out.println("Your Number is Positive ");
        }else {
            System.out.println("Your Number is Negative ");
        }
    }
}