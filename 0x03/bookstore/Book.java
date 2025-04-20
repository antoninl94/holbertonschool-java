package bookstore;

import bookstore.exceptions.InvalidAuthorException;
import bookstore.exceptions.InvalidBookException;


public class Book {
  String title;
  String author;
  double price;

  public Book(String title, String author, double price) throws InvalidBookException, InvalidAuthorException {
    setTitle(title);
    setAuthor(author);
    setPrice(price);
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  // author must have at least 2 words
  public void setAuthor(String author) throws InvalidAuthorException {
    int countNames = author.split(" ").length;
    if (countNames < 2) {
      throw new InvalidAuthorException("Invalid author name");
    }
    this.author = author;
  }

  // title must have at least 3 letters
  public void setTitle(String title) throws InvalidBookException {
    int countLetters = title.length();
    if (countLetters < 3) {
      throw new InvalidBookException("Invalid book title");
    }
    this.title = title;
  }

  // price must be greater than 0
  public void setPrice(double price) throws InvalidBookException {
    if (!(price > 0)) {
      throw new InvalidBookException("Invalid book price");
    }
    this.price = price;
  }
}
