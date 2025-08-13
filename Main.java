import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 0.0;
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Simple Bank Account System ===");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("💰 Your balance: %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("✅ Deposit successful!");
                    } else {
                        System.out.println("❌ Invalid deposit amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("✅ Withdrawal successful!");
                    } else {
                        System.out.println("❌ Invalid withdrawal amount or insufficient funds!");
                    }
                    break;
                case 4:
                    System.out.println("👋 Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option!");
            }
        } while (choice != 4);

        scanner.close();
    }
}
