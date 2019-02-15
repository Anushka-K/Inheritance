package practice.util;

public class BasicCounter implements Counter{
  int count;
  int start;
  
  public BasicCounter(int newStart) {
    this.count=newStart;
    this.start=newStart;
    
 }//constructor
  

  public void increment() {
    this.count+=1;
    
  }
  
  public void reset() {
    this.count=this.start;
  }
  
  public String toString() {
    return "[" + this.count + "]";
  }
  
  public int get() {
    return this.count;
  }
}
