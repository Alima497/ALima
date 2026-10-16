import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number N");
        int N = scanner.nextInt();
        System.out.println("For loop");
        for (int i = 1; i <=N ; i++) {
            if( i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("While loop");
        int i2=1;
        while (i2<=N){
            if ( i2 % 2!=0 ) {
                System.out.println(i2);
            }
            i2++;
        }
        System.out.println("Do-while loop");
        int i3 = 1;
        do {
            if(i3% 2 !=0) {
                System.out.println(i3);
            }
            i3++;
        }
        while(i3<=N);
    }

}

