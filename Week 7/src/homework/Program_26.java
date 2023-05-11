package homework;

import java.util.Scanner;

public class Program_26 {
    public static void main(String[] args) {
        new Program_26().reverse_Word();
    }

    public void reverse_Word(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(reverse);
    }
}
