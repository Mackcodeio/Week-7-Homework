package homework;
 /*
    9. Write java program using for loop and print your group name 10 times.
 * */
public class Program_9 {
    public static void main(String[] args) {
       String group_name = "POSTMAN TESTING TEAM";

        System.out.println("My Group name is :");
        System.out.println("---------------------------");
       for (int i= 0; i<11; i++){
           System.out.println(i +". " + group_name);
       }
    }
}
