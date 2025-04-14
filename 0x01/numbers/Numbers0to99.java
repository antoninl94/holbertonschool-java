public class Numbers0to99 {
  public static void main (String[] args) {
    for (int num = 0; num <= 99; num++) {
      if (num == 99) {
        System.out.printf("%d\n", num);
      }
      System.out.printf("%d, ", num);
    }
  }
}
