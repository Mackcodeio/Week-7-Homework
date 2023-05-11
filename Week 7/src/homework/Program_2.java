package homework;

/*
     2. Declare array and store any 5 countries and print them in console.
* */
public class Program_2 {
    public static void main(String[] args) {

        // create object and call instance method.
        new Program_2().printListOfCountry();
    }

    // instance method start
    public void printListOfCountry() {
        String country[] = {"India", "USA", "Dubai", "UK", "China"};  // list of 5 county that store in array.

        System.out.println("List of 5 Top Country ");
        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(country[i]);                        // print list of country using for loop.
        }
    }
}
