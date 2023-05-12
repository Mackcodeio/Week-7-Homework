package midWeek;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum=0;
        int avg;

        System.out.println("Enter 10 number");
        for(int i=1;i<=10;i++){
            System.out.print("Enter "+i+" number: ");
            num = sc.nextInt();
            sum = num + sum;
        }

        avg = sum/10;

        System.out.println("---------------------------------------------");
        System.out.println("Sum of 10 number is: "+sum);
        System.out.println("Average of 10 number is: "+avg);
    }
}
