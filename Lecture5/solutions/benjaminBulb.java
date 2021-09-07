import java.util.*;

public class benjaminBulb {
//The Curious Case Of Benjamin Bulbs
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int div = 1;
    //Prefer Number has odd number of divisors where as non-prefect has even
    //(2n+1) and (2n)
    //All Unique numbers exist before sqrt(n)
    //Odd Toggle means Bulb is on
    while (div * div <= n) {
      System.out.println(div * div);
      div++;
    }
  }
}