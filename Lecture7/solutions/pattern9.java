import java.util.*;

public class pattern9 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    //Outer Space
    int os = 0;
    //Inner Space
    int is = n  - 2;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= os; j++) {
        System.out.print("\t");
      }
      System.out.print("*\t");


      for (int j = 1; j <= is; j++) {
        System.out.print("\t");
      }
      //When i is not the middle one
      if (i != n / 2 + 1) {
        System.out.print("*\t");
      }
      System.out.println();
      if (i <= n / 2) {
        os++;
        is -= 2;
      } else {
        os--;
        is += 2;
      }

    }
    scn.close();

  }
}