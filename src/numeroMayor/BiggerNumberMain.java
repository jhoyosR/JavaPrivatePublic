package numeroMayor;

import java.util.Scanner;

public class BiggerNumberMain {
    public static void main(String[] args) {
        BiggerNumber biggerNumber = new BiggerNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number");
        biggerNumber.n1 = scanner.nextInt();
        System.out.println("Insert the second number");
        biggerNumber.n2 = scanner.nextInt();
        System.out.println("Insert the third number");
        biggerNumber.n3 = scanner.nextInt();

        System.out.println(biggerNumber.biggerCalculator());
    }
}
