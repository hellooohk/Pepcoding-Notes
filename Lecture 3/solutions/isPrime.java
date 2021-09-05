import java.util.*;

public class isPrime {
    /* Is A Number Prime */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // @t No of cases to be tested
        int t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            // @num Number to be tested
            int num = scn.nextInt();
            // Assumption Number is prime
            boolean isPrime = true;
            int div = 2;
            // Checking till square root of num
            while (div * div <= num) {
                int rem = num % div;
                if (rem == 0) {
                    // Assumption failed
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}