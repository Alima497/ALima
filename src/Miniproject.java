import java.util.Scanner;
public class Miniproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        double balance = 0.0;
        int attempts = 3;
        boolean loggedIn = false;
        while (attempts > 0) {
            System.out.println("==== SIMPLE ATM ====");
            System.out.println("Enter your PIN:");
            int PIN = scanner.nextInt();
            if (PIN == correctPin) {
                System.out.println("Login successful");
                loggedIn = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect PIN");
                if (attempts > 0) {
                    System.out.println("Remaining attempts:" + attempts);
                }
            }
        }
        if (loggedIn == false) {
            System.out.println("Your account has been blocked");
            return;
        }
        if (loggedIn) {
            int option = 0;
            while (option != 4) {
                System.out.println("=== ATM MENU ===");
                System.out.println("1.Check balance");
                System.out.println("2.Deposit money");
                System.out.println("3.Withdraw money");
                System.out.println("4.Exit");
                System.out.println("Choose an option: ");
                option = scanner.nextInt();
                if ( option == 1) {
                    System.out.println("Current balance:" + balance);
                } else if ( option == 2) {
                    System.out.println("Enter your deposit ammount:");
                    double amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Updated balance:" + balance);
                    } else {
                        System.out.println("Amount must be graeater then zero.");
                    }
                } else if ( option == 3) {
                    System.out.println("Enter the withdrawal amount:");
                    double amount = scanner.nextDouble();
                    if (amount <= 0)
                    {
                        System.out.println("Amount must be greater than zero.");
                    } else if (amount > balance) {
                        System.out.println("Amount must not be greater than the current balance.");
                    } else {
                        balance -= amount;
                        System.out.println("Updated balance:" + balance);
                    }
                } else if (option == 4) {
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("Invalid option.Please try again");

                }
            }
        }
        scanner.close();
    }
}



