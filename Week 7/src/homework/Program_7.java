package homework;

/*
    7. Write a java program to input any number and find out if it’s odd or even.

* */
import java.util.Scanner;

/*
7. Write a java program to input any number and find out if it’s odd or even.
*
*/
public class Program_7 {
    public static void main(String[] args) {
        new Program_7().evenodd();
    }

    public void evenodd(){
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number+" is Even");
        }
        else {
            System.out.println(number+" is odd");
        }
    }
}
