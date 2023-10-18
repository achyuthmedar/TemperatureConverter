import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert from Celsius to Fahrenheit");
        System.out.println("2. Convert from Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return;
        }

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        if (choice == 1) {
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println(temperature + "°C is equal to " + fahrenheit + "°F.");
        } else {
            double celsius = (temperature - 32) * 5/9;
            System.out.println(temperature + "°F is equal to " + celsius + "°C.");
        }

        scanner.close();
    }
}
