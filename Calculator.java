import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
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

        // Step 3: Multiplying/Dividing whole numbers
        System.out.print("Do you want to multiply or divide? (mul/div): ");
        operation = scanner.next();
        if (operation.equals("mul")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation.equals("div")) {
            if (num2 != 0) {
                System.out.println("Result: " + ((double) num1 / num2));
            } else {
                System.out.println("Error: Divide by Zero");
            }
        } else {
            System.out.println("Invalid operation.");
        }
        // Step 4: adding, subtracting, multiplying, and dividing uisng decimal numbers
         System.out.print("Enter two decimal numbers separated by space: ");
        double decimal1 = scanner.nextDouble();
        double decimal2 = scanner.nextDouble();
        System.out.print("What operation do you want to perform? (add/sub/mul/div): ");
        operation = scanner.next();
        if (operation.equals("add")) {
            System.out.println("Result: " + (decimal1 + decimal2));
        } else if (operation.equals("sub")) {
            System.out.println("Result: " + (decimal1 - decimal2));
        } else if (operation.equals("mul")) {
            System.out.println("Result: " + (decimal1 * decimal2));
        } else if (operation.equals("div")) {
            // Step 5: If divided by zero
            if (decimal2 != 0) {
                System.out.println("Result: " + (decimal1 / decimal2));
            } else {
                System.out.println("Error: Divide by Zero");
            }
        } else {
            System.out.println("Invalid operation.");
        }

        scanner.close();
        }
    }
