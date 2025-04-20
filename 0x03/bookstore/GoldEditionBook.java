package bookstore;

import bookstore.exceptions.InvalidAuthorException;
import bookstore.exceptions.InvalidBookException;

public class GoldEditionBook extends Book {

  public GoldEditionBook(String title, String author, double price) throws InvalidBookException, InvalidAuthorException {
    super(title, author, price);
  }

  @Override
  public double getPrice() {
    return price + (price * 30 / 100);
  }
}
