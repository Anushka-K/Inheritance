package practice.util;

public class BoundedCounter extends BasicCounter {

  public int bound;

  public BoundedCounter(int start, int bound) {
    super(start);
    this.bound = bound;
  }
  
  @Override
  public void increment() throws Exception {
    if (count <= bound){
      this.count+=1;
    } else {
      throw new Exception("current count exceeds bound"); 
    }
  }
}
