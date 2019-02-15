package practice.util;

public class DecrementableCounter extends BasicCounter {
  public DecrementableCounter(int start) {
    super(start);
  } // DecrementableCounter(int)
  public void decrement() {
    this.count -= 1;
  }
} // class DecrementableCounter
