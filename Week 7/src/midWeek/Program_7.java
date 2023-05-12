package midWeek;

import java.util.Scanner;

// Take input of age of 3 people by user and determine oldest and youngest among them.
public class Program_7 {
    public static void main(String[] args) {
        new Program_7().olderYounger();
    }

    public void olderYounger(){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.print("Please enter first person age:");
        int age1 = sc.nextInt();

        System.out.print("Please enter second person age:");
        int age2 = sc.nextInt();

        System.out.print("Please enter third person age:");
        int age3 = sc.nextInt();

        int oldest = 0;
        int youngest = 0;

        if(age1 > age2 && age1 > age3){ oldest = age1; }
        if(age2 > age1 && age2 > age3){ oldest = age2; }
        if(age3 > age1 && age3 > age1){ oldest = age3; }


        if(age1 < age2 && age1 < age3){ youngest = age1; }
        if(age2 < age1 && age2 < age3){ youngest = age2; }
        if(age3 < age1 && age3 < age1){ youngest = age3; }

        System.out.println("------------------------------------------");
        System.out.println("The youngest person's age is " + youngest + " and the oldest one is " + oldest + " years old.");
    }
}
