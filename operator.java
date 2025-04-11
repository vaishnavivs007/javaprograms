import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nRelational Operators:");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));

        System.out.print("\nEnter a boolean value (true/false) for the first condition: ");
        boolean condition1 = scanner.nextBoolean();
        
        System.out.print("Enter a boolean value (true/false) for the second condition: ");
        boolean condition2 = scanner.nextBoolean();

        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!(condition1 && condition2): " + !(condition1 && condition2));

        scanner.close();
    }
}

