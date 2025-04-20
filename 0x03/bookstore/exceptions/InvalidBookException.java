package bookstore.exceptions;

public class InvalidBookException extends RuntimeException {
  public InvalidBookException(String errorMessage) {
    super(errorMessage);
  }
}
