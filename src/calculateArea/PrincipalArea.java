package calculateArea;

import java.util.Scanner;

public class PrincipalArea {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert base: ");
        area.base = scanner.nextInt();

        System.out.println("Insert height: ");
        area.height = scanner.nextInt();

        System.out.println("Data validation: " + area.validateData());
        area.validateData();

        System.out.println("The area of the rectangle is: " + area.calculateArea());

        }
    }

