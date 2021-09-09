import java.util.*;

public class pattern5 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    for (int i = 0 ; i < n ; i++) {
      if (i <= n / 2) {
        for (int j = n / 2 - i; j >= 1 ; j--) {
          System.out.print("\t");
        }
        for (int j = 1 ; j <= 2 * i + 1; j++ ) {
          System.out.print("*\t");
        }
      }
      else {
        for (int j = 0 ; j < i - n / 2 ; j++) {
          System.out.print("\t");
        }
        for (int j = 0 ; j < n / 2; j++) {
          System.out.print("*\t");
        }
      }
      System.out.println();
    }

  }
}