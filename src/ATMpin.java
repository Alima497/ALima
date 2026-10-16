import java.util.Scanner;
public class ATMpin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int attempts = 3;
        while ( attempts > 0 && attempts <= 3) {
            System.out.println("Please, enter your PIN");
            int PIN = scanner.nextInt();
            int correctPin = 1234;
            System.out.println("your PIN:" + PIN);
            if ( PIN == correctPin ) {
                System.out.println("PIN is correct");
                return;
            }
            else if (PIN != correctPin) {
                attempts --;
                System.out.println("PIN is uncorrect");
                System.out.println("Attempts left:" + attempts);
            }
            else {
                System.out.println("Fail");

            }
        }
    }

}

