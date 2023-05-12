package midWeek;

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        new Program_8().isAllowExam();
    }

    public void isAllowExam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Class no: ");
        int classno = sc.nextInt();

        System.out.println("Enter Class Attended number: ");
        int classAttended = sc.nextInt();

        int percentage = (classAttended * 100)/100;

        System.out.println("percentage :"+percentage);
        if(percentage >= 75){
            System.out.println("Allowed to sit in exam");
        }else {
            System.out.println("Not allowed to sit in exam");
        }
    }
}
