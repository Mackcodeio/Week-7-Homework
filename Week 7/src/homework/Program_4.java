package homework;

import java.util.Scanner;

/*
     4. Write if else condition and print your group name in console else others group name.
* */
public class Program_4 {

    public static void main(String[] args) {
        new Program_4().grpName();
    }

    public void grpName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Group Name:");
        String group_name = sc.nextLine();

        String post= "Postman";
        String selenium= "Selenium";
        String java= "Java";

        if (group_name.equalsIgnoreCase(post)) {
            System.out.println("Welcome to our Postman Family study group.");
            System.out.println("Please contact to Punamben Makvana. she is admin of the group.");

        } else if (group_name.equalsIgnoreCase(selenium)) {
            System.out.println("Please join Selenium group.");
            System.out.println("Please text to Mahesh Hirpara. He is admin of the group.");

        } else if (group_name.equalsIgnoreCase(java)){
            System.out.println("Please join Java group.");
            System.out.println("Please text to Nimit Patel he is admin of the group.");

        } else{
            System.out.println("This is not any group existing....");
            System.out.println("Thank you very much for Visitig Testing Class.");
        }
    }
}
