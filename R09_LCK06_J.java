public final class CountBoxes implements Runnable {
  private static volatile int counter;
  // ...
 
  public synchronized void run() {
    counter++;
    // ...
  }
  // ...
}




public class CountBoxes implements Runnable {
  private static int counter;
  // ...
  private static final Object lock = new Object();
 
  public void run() {
    synchronized (lock) {
      counter++;
      // ...
    }
  }
  // ...
}