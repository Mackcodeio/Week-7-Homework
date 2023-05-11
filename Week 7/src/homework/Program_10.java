package homework;

import java.util.Scanner;

/*
    10. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission

    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
    >= 20,000 10%
    >= 10,000 5%
    < 10,000 2%

* */
public class Program_10 {

    public static void main(String[] args) {
        new Program_10().my_total_salary();
    }

   public void my_total_salary(){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Sales ID number: ");
       String sales_id = sc.next();

       System.out.print("Enter Sales Name: ");
       String sales_name = sc.next();

       System.out.print("Enter Sales Amount: ");
       double sales_amount = sc.nextDouble();

       System.out.print("Enter your basic salary: ");
       double sales_basic = sc.nextDouble();

       double commission_amount = 0.0;
       double commission;

       if(sales_amount >= 50000){
           commission = 35;
           System.out.println("Your commission is Percantage: "+commission);

       }else if(sales_amount >= 30000){
           commission = 20;
           System.out.println("Your commission is Percantage: "+commission);

       } else if (sales_amount >= 20000) {
           commission = 10;
           System.out.println("Your commission is Percantage: "+commission);

       } else if (sales_amount >= 10000) {
           commission = 5;
           System.out.println("Your commission is Percantage: "+commission);

       }else {
           commission = 2;
           System.out.println("Your commission is Percantage: "+commission);
       }
       commission_amount = (commission/100) * sales_amount;
       System.out.println("commission_amount :"+String.format("%2f",commission_amount));

       System.out.println("---------------------------------------------------");
       double total_salary = sales_basic + commission_amount;
       System.out.println("Total Salary: "+String.format("%2f",total_salary));
    }

}
