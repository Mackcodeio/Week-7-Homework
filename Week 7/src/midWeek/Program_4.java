package midWeek;

// 4. Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        new Program_4().isSquare();
    }

    public void isSquare(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Length: ");
        int length = sc.nextInt();

        System.out.println("Enter the value of Length: ");
        int breadth = sc.nextInt();

        int rectangle = length * breadth;

        System.out.println("-------------------------------------");
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Rectangle Size: "+rectangle);

        if(length == breadth){
            System.out.println("Is a Square");
        }else {
            System.out.println("Is not a Square");
        }
    }
}
