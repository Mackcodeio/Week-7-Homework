package midWeek;

// 5. Take two int values from user and print greatest among them.

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        new Program_5().greatest();
    }

    public void greatest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("----------------------------------------------");
        if(num1>num2){
            System.out.println("Number "+num1+" is Greatest number ");
        }else {
            System.out.println("Number "+num2+" is Greatest number ");
        }
    }
}
