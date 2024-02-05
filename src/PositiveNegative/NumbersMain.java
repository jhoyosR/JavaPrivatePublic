package PositiveNegative;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number you want to evaluate");
        numbers.n1 = scanner.nextInt();
        System.out.println("The number " + numbers.calculator());
    }
}
