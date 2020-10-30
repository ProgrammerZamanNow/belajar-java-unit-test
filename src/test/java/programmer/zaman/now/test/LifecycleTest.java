package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

  private String temp;

  @Test
  void testA() {
    temp = "Eko";
  }

  @Test
  void testB() {
    System.out.println(temp);
  }
}
