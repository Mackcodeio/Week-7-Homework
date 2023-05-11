package homework;

import java.util.Scanner;

    /*
        12. Same as above program-11 using switch statement.
    */
public class Program_12 {
    public static void main(String[] args) {
        new Program_12().cityName();
    }

    public void cityName(){

        System.out.println("Enter signal character A to F and print city name: ");
        Scanner sc = new Scanner(System.in);
        char city = sc.next().charAt(0);

        switch (city) {
            case 'A':
                System.out.println("Acton, Greater London");
                break;
            case 'B':
                System.out.println("Bacup, Lancashire");
                break;
            case 'C':
                System.out.println("Caddington, Bedfordshire");
                break;
            case 'D':
                System.out.println("Dalton-in-Furness, Cumbria");
                break;
            case 'E':
                System.out.println("Ealing, Greater London");
                break;
            case 'F':
                System.out.println("Fair Oak, Hampshire");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
