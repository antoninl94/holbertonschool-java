public class Numbers0to99 {
  public static void main (String[] args) {
    for (int num = 0; num <= 99; num++) {
      if (num > 0) {
        System.out.print(", ");
      }
      System.out.printf("%d", num);
    }
    System.out.print("\n");
  }
}
