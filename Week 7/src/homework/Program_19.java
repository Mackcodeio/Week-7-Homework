package homework;
import java.util.Scanner;

// 19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”

public class Program_19 {
    public static void main(String[] args) {
        new Program_19().chekNumber();
    }

    public void chekNumber(){

        System.out.println("Enter any number and we check is POSITIVE or NEGATIVE");
        Scanner sc=new Scanner(System.in);
        double number = sc.nextDouble();

        if(number > 0){
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else if (number == 0) {
            System.out.println("ZERO");
        }
    }
}
