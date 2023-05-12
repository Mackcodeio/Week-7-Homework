package midWeek;

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        new Program_10().sumofTwoNumber();
    }
    public void sumofTwoNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two number: "+sum);
    }
}
