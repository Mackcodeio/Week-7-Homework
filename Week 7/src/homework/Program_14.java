package homework;

/*
    14. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and
        5 separately.
* */
public class Program_14 {
    public static void main(String[] args) {
        System.out.println("Bellow list of number those are in Between 1 to 100 and that are divied by 3 and 5 ");
        numberDiviedBy3();
        numberDiviedBy5();

    }

    public static void numberDiviedBy3() {
        System.out.println("list of number Divied by 3");

        for (int i = 1; i < 100; i++){
            if(i%3 == 0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    public static void numberDiviedBy5(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("list of number Divied by 5");

        for (int i = 1; i < 100; i++){
            if(i%5 == 0){
                System.out.print(i+", ");
            }
        }
    }
}
