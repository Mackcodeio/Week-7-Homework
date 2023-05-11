package homework;

import java.util.Scanner;

/*
    13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
        find addition, Subtraction, multiplication and division according to theirsymbol(using if else)
* */
public class Program_13 {
    public static void main(String[] args) {
        new Program_13().calcuate();
    }

    public void calcuate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter any from like (+,-,*,/) :");
        String symbol = sc.next();

        double cal;

        System.out.println("------------------Calculation------------------");
        if(symbol.equalsIgnoreCase("+")){
            cal = num1+num2;
            System.out.println("Addition of "+num1+" and "+num2+ " is: " +cal);

        }else if(symbol.equalsIgnoreCase("-")) {
            cal = num1-num2;
            System.out.println("Subtraction of "+num1+" and "+num2+ " is: " +cal);

        }else if(symbol.equalsIgnoreCase("*")) {
            cal = num1*num2;
            System.out.println("Multiplication of "+num1+" and "+num2+ " is: " +cal);

        }else if(symbol.equalsIgnoreCase("/")) {
            cal = num1/num2;
            System.out.println("Division of "+num1+" and "+num2+ " is: " +cal);

        }else {
            System.out.println("Invalid Input");

        }
    }
}
