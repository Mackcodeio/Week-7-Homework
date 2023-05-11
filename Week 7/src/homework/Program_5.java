package homework;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args)// main method
    {
        markSheet();
    }

    public static void markSheet()// static method
    {
        Scanner s = new Scanner(System.in);// scanner class declared
        System.out.println("Enter your Name:"); // called name
        String Name = s.nextLine();

        System.out.println("Enter your Roll No:");// Called Rollno
        int RN = s.nextInt();

        System.out.println("Enter marks for Maths: "); // asking user to put Maths marks
        int mths = s.nextInt();

        //Check statement of Maths marks
        if (mths >= 0 && mths <= 100) {
            System.out.println("Mathe's marks: "+mths);
        } else {
            do{
                System.out.println("Enter valid marks between 0 to 100");
                System.out.println("Enter marks for Maths:");
                mths = s.nextInt();
            }while (mths<0);
        }

        System.out.println("Enter marks for English : "); // asking user to put Maths marks
        //Invalid statement for English marks
        int eng = s.nextInt();
        if (eng >= 0 && eng <= 100) {
            System.out.println("English Marks: "+eng);
        } else{
            do{
                System.out.println("Enter valid marks between 0 to 100");
                System.out.println("Enter marks for English:");
                eng = s.nextInt();
            }while (eng<0);
        }

        System.out.println("Enter marks for Science : "); // asking user to put Science marks
        //Invalid statement for English marks
        int sci = s.nextInt();
        if (sci >= 0 && sci <= 100) {
            System.out.println("Science marks: "+sci);
        }
        else {
            do {
                System.out.println("Enter valid marks between 0 to 100");
                System.out.println("Enter marks for Science:");
                sci = s.nextInt();
            }while (sci<0);
        }


        int total = mths + eng + sci;
        double percentage = (double) total / 3;

        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("|-------------------------------------------------|");
        System.out.println("                    Mark Sheet                     ");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|               Name: " + Name + "                |");
        System.out.println("|               Roll No: " + RN +"                |");
        System.out.println("|                                                 |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|            Subject      |      Marks      |      ");
        System.out.println("|--------------------------------------------------");
        System.out.println("|            Math         :        " + mths+ "    |");
        System.out.println("|            Science      :        " + sci + "    |");
        System.out.println("|            English      :        " + eng + "    |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|            Total Marks  :      " + total + "    |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|            Percentage   :     " + String.format("%.02f", percentage) +"        |");
        System.out.println("|            Result       :     " + result +"           |");
        System.out.println("|            Grade        :     " + grade +"            |");
        System.out.println("|-------------------------------------------------|");

    }
}
