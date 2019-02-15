package practice.util;

import static org.junit.jupiter.api.Assertions.*;

class Test {

  @org.junit.jupiter.api.Test
  
  public void test() throws Exception {
    Counter alpha = new BasicCounter(0);
    Counter beta = new DecrementableCounter(123);
    DecrementableCounter gamma = new DecrementableCounter(-5);
    assertEquals(0, alpha.get(), "original alpha");
    assertEquals(123, beta.get(), "original beta");
    assertEquals(-5, gamma.get(), "original gamma");
    for (int i = 0; i < 10; i++) {
      alpha.increment();
      beta.increment();
      gamma.increment();
    } // for
    assertEquals(10, alpha.get(), "updated alpha");
    assertEquals(133, beta.get(), "updated beta");
    assertEquals(5, gamma.get(), "updated gamma");
    alpha.reset();
    beta.reset();
    gamma.reset();
    assertEquals(0, alpha.get(), "reset alpha");
    assertEquals(123, beta.get(), "reset beta");
    assertEquals(-5, gamma.get(), "reset gamma");
    
    gamma.reset();
    assertEquals(-5, gamma.get(), "reset gamma");
    gamma.decrement();
    assertEquals(-6, gamma.get(), "decremented gamma");


    
  } // test()
}
