package SandwichOrder;

import javax.swing.*;
import java.util.Scanner;

public class SandwichMain {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the size of your sandwich: (Small/Large)");
        sandwich.setSandwichSize(scanner.next());
        System.out.println("Would you like jalapeno? (true to yes/false to no)");
        sandwich.setJalapeno(scanner.nextBoolean());
        System.out.println("Would you like bacon? (true to yes/false to no)");
        sandwich.setBacon(scanner.nextBoolean());
        System.out.println("Would you like cheese? (true to yes/false to no)");
        sandwich.setCheese(scanner.nextBoolean());
        System.out.println("Would you like turkey? (true to yes/false to no)");
        sandwich.setTurkey(scanner.nextBoolean());

        System.out.println("Your sandwich will be: $" + sandwich.sandwichPrice());


    }
}
