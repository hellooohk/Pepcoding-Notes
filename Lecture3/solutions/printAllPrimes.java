import java.util.*;

public class printAllPrimes {
    /* Print All Primes Till N */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
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
                System.out.println(i);
            }

        }
    }
}
