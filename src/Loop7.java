import java.util.Scanner;
public class Loop7 {
    public static void main(String[] args) {
        System.out.println("Enter number N");
        for (int i = 1; i <= 20; i++) {
            if ( i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
        }
          else if ( i % 5 == 0) {
               System.out.println("Buzz");
           }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);

            }
        }

    }
}