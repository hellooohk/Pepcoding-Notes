import java.util.*;

public class primeFactorization {

  //prime factorization
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //We will check till sqrt n Why? No. Exist in pairs.
    //there will be no unique numbers after sqrt n
    
    for (int f = 2; f * f <= n; f++) {
      //dividing until its divided
      while (n % f == 0) {
        System.out.print(f + " ");
        n = n / f;
      }
    }
    //This is special case consider 46
    //2 * 23 we go prime number as factor so we have to consider
    //In normal case we get n as 1
    if (n > 1) {
      System.out.print(n + " ");
    }

  }
}