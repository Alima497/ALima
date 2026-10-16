import java.util.Scanner;
public class Guessnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 7;
        int attempts = 0;
        while (attempts >= 0 && attempts <= 4) {
            System.out.println("Please, enter your guess");
            int guess = scanner.nextInt();
            attempts++;
            if (guess > 7) {
                System.out.println("Your guess is too high");
            } else if (guess < 7) {
                System.out.println("Your guess is too low");
            } else if (guess == 7) {
                System.out.println("Exactly");
                System.out.println("You needed:" + attempts + " " + "attempts");
            }
        }
        System.out.println("Game over! The secret number was 7");
    }
}

