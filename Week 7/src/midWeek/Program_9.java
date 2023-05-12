package midWeek;

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        new Program_9().isAllowExam();
    }

    public void isAllowExam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Class no: ");
        int classno = sc.nextInt();

        System.out.println("Enter Class Attended number: ");
        int classAttended = sc.nextInt();

        int percentage = (classAttended * 100)/100;
        System.out.println("percentage :"+percentage);


        System.out.println("Are you medical cause (Y/N) :");
        char city = sc.next().charAt(0);
        System.out.println(city);

        if(city == 'y'){
            if(percentage >= 75){
                System.out.println("Allowed to sit in exam.");
            }else {
                System.out.println("Not allowed to sit in exam because low acttendance.");
            }
        }else {
            System.out.println("You are not medical cause");
            System.out.println("You are Not allowed to sit in exam.9");
        }



    }
}
