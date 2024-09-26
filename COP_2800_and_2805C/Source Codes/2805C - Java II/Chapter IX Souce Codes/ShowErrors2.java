/*
 * 9.4.3
 * What is wrong with each of the following program?
 */

public class ShowErrors2 {
  public static void main(String[] args) {
    C c = new C(5.0);
    System.out.println(c.value);
  }
}

class C {
  int value = 2;
}
