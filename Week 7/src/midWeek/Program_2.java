package midWeek;

// 2. Print multiplication table of 24, 50 and 29 using loop.
public class Program_2 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 50;
        int num3 = 29;

        System.out.println("Multiplication of Table of 24: ");
        for(int i=1;i<=10;i++){
            System.out.println(num1 +" * "+ i +" = "+num1*i);
        }

        System.out.println();
        System.out.println("Multiplication of Table of 50: ");
        for(int i=1;i<=10;i++){
            System.out.println(num2 +" * "+ i +" = "+num2*i);
        }

        System.out.println();
        System.out.println("Multiplication of Table of 50: ");
        for(int i=1;i<=10;i++){
            System.out.println(num3 +" * "+ i +" = "+num3*i);
        }

    }
}
