import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double usdToPesosRate = 56.43;
        double eurToPesosRate = 62.69;
        double yenToPesosRate = 0.39;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Convert USD to Pesos");
            System.out.println("2. Convert EUR to Pesos");
            System.out.println("3. Convert YEN to Pesos");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scnr.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount in USD: ");
                    double usdAmount = scanner.nextDouble();
                    double usdAmountToPesos = usdAmount * usdToPesosRate;
                    System.out.println(usdAmount + " USD is equivalent to " + usdAmountToPesos + " Pesos");
                    break;
                case 2:
                    System.out.print("Enter the amount in EUR: ");
                    double eurAmount = scanner.nextDouble();
                    double euroAmountToPesos = eurAmount * eurToPesosRate;
                    System.out.println(eurAmount + " EUR is equivalent to " + euroAmountToPesos + " Pesos");             
                    break;
                case 3:
                    System.out.print("Enter the amount in YEN: ");
                    double yenAmount = scanner.nextDouble();
                    double yenAmountToPesos = yenAmount * yenToPesosRate;
                    System.out.println(yenAmount + " YEN is equivalent to " + yenAmountToPesos + " Pesos");
                    break;
                case 4:
                    System.out.println("Thank you for using the Currency Converter!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
