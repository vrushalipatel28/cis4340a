public class NaNComparison {
  public static void main(String[] args) {
    double x = 0.0;
    double result = Math.cos(1/x); // Returns NaN if input is infinity
    if (Double.isNaN(result)) {
      System.out.println("result is NaN");
    }
  }
}


public class NaNComparison {
  public static void main(String[] args) {
    double x = 0.0;  
    double result = Math.cos(1/x); // Returns NaN when input is infinity
    if (Double.isNaN(result)) {
      System.out.println("result is NaN");
    }
  }
}
