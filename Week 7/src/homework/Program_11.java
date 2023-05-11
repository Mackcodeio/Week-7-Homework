package homework;

import java.util.Scanner;

/*

    11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
        other alphabet should be invalid entry.

* */
public class Program_11 {

    public static void main(String[] args)
    {
       new Program_11().cityName();
    }

    public void cityName(){

        System.out.println("Enter signal character A to F and print city name: ");
        Scanner sc = new Scanner(System.in);
        char city = sc.next().charAt(0);

        Character charValue1 = new Character('A');
        Character charValue2 = new Character('B');
        Character charValue3 = new Character('C');
        Character charValue4 = new Character('D');
        Character charValue5 = new Character('E');
        Character charValue6 = new Character('F');

        if(charValue1.equals(city)){
            System.out.println("Acton, Greater London");
        }else if (charValue2.equals(city)){
            System.out.println("Bacup, Lancashire");
        }else if (charValue3.equals(city)){
            System.out.println("Caddington, Bedfordshire");
        }else if (charValue4.equals(city)){
            System.out.println("Dalton-in-Furness, Cumbria");
        }else if (charValue5.equals(city)){
            System.out.println("Ealing, Greater London");
        }else if (charValue6.equals(city)){
            System.out.println("Fair Oak, Hampshire");
        }else {
            System.out.println("Invalid entry");
        }
    }
}
