package homework;

/*
* 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PFPrint
* */

import java.util.Scanner;

public class Program_6 {

    public String Employee_ID;
    public String Employee_Name;
    public int basicSalary,HRA,TA,DA,PF,gross_salary;

    Scanner sc = new Scanner(System.in);
    public void salaryslip() {

        System.out.println("Enter the employee ID: ");
        Employee_ID = sc.next();

        System.out.println("Enter the employee name: ");
        Employee_Name = sc.next();

        System.out.println("Enter the basic salary of an employee: ");
        basicSalary = sc.nextInt();

        calculate();
    }
    public void calculate(){

       if(basicSalary <= 0){
           // do..Whilw loop : until user not enter positive number this loop execue.
           do{
               System.out.println("Please Enter Valid Basic Salary");
               basicSalary = sc.nextInt();
           }while (basicSalary<=0);
       }else {
           HRA=10*(basicSalary/100);
           DA=8*(basicSalary/100);
           TA=9*(basicSalary/100);
           PF=20*(basicSalary/100);

           gross_salary=basicSalary+HRA+TA+DA-PF;
       }
       display();
    }
    public void display(){
        System.out.println("|----------------------------------------------|");
        System.out.println("|                   Salary Slip                |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|                                              |");
        System.out.println("| Employee id   :  "+Employee_ID+"             |");
        System.out.println("| Employee id   :  "+Employee_Name+"           |");
        System.out.println("|                                              |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|                                              |");
        System.out.println("| Basic Salary  :  "+basicSalary+"             |");
        System.out.println("| HRA 10%       :  "+HRA+"                     |");
        System.out.println("| TA 8%         :  "+TA+"                      |");
        System.out.println("| DA 9%         :  "+DA+"                      |");
        System.out.println("| PF 20%        :  "+PF+"                      |");
        System.out.println("|                                              |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|                                              |");
        System.out.println("| Gross Salary   :  "+gross_salary+"           |");
        System.out.println("|----------------------------------------------|");
        System.out.println("|----------------------------------------------|");
    }

    public static void main(String[] args) {
        new Program_6().salaryslip();
    }

}
