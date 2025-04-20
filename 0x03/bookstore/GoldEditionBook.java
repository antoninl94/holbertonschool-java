package bookstore;

public class GoldEditionBook extends Book {

  public GoldEditionBook(String title, String author, double price) {
    super(title, author, price);
  }

  @Override
  public double getPrice() {
    return price + (price * 30 / 100);
  }
}
