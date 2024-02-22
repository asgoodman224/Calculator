import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Adding two whole numbers
        System.out.print("Enter two whole numbers separated by a space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Adding and/or Subtracting whole numbers
        System.out.print("Do you want to add or subtract? (add/sub): ");
        String operation = scanner.next();
        if (operation.equals("add")) {
            System.out.println("Result: " + sum);
        } else if (operation.equals("sub")) {
            System.out.println("Result: " + (num1 - num2));
        } else {
            System.out.println("Invalid operation.");
        }

    }
}
