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
