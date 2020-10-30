package programmer.zaman.now.test;


import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

  private int counter = 0;

  @BeforeAll
  void beforeAll() {

  }

  @AfterAll
  void afterAll() {

  }

  @Test
  @Order(1)
  void test3() {
// PER METHOD
//    OrderedTest test3 = new OrderedTest();
//    test3.test3();
//
//    OrderedTest test2 = new OrderedTest();
//    test2.test2();
//
//    OrderedTest test1 = new OrderedTest();
//    test1.test1();

// PER CLASS
//    OrderedTest test = new OrderedTest();
//    test.test3();
//    test.test2();
//    test.test1();

    counter++;
    System.out.println(counter);
  }

  @Test
  @Order(3)
  void test2() {
    counter++;
    System.out.println(counter);
  }

  @Test
  @Order(2)
  void test1() {
    counter++;
    System.out.println(counter);
  }
}
