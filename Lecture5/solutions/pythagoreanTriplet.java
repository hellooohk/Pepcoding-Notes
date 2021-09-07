import java.util.*;

public class pythagoreanTriplet {
    //Pythagorean Triplet
  public static void main(String[] args) {
   
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    //According to Pythagoras a^2 = b^2 + c^2 for a given right angle triangle
    //Here we have to cover three cases
    //a is the larger side or hypotenuse
    if (a * a == b * b + c * c) {
      System.out.println(true);
    }
     //b is the larger side or hypotenuse
    else if (b * b == a * a + c * c) {
      System.out.println(true);
    }
     //c is the larger side or hypotenuse
    else if (c * c == b * b + a * a) {
      System.out.println(true);
    }
    //Pythogorean Theorem failed so return false
    else {
      System.out.println(false);
    }
  }
}