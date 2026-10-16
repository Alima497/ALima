import java.util.Scanner;
public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount= 0;
        int evenCount = 0;
        int oddCount = 0;
        for ( int i = 1; i <= 10; i++) {
            System.out.println("Enter your number "+ i + ":" );
            int num = scanner.nextInt();
            if ( num > 0 ) {
                positiveCount++;
            } else if ( num < 0) {
                negativeCount++;
            } else  {
                zeroCount++;
            }
            if ( num % 2 == 0) {
                evenCount++; }
            else if ( num % 2 != 0){
                oddCount++;
            }
        }
        scanner.close();
        System.out.println("STATISTICS");
        System.out.println("Positive numbers:" + positiveCount);
        System.out.println("Negative numbers:" + negativeCount);
        System.out.println("Zeros:" + zeroCount);
        System.out.println("Even numbers:" + evenCount);
        System.out.println("Odd numbers:" + oddCount);
    }
}


