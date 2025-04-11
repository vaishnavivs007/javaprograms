import java.util.Scanner;

public class switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1 to 12): ");
        int month = scanner.nextInt();

        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            default:
                monthName = "Invalid month number!";
        }

        System.out.println("Month: " + monthName);
    }
}
