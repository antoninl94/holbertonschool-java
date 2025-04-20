package bookstore.exceptions;

public class InvalidAuthorException extends Exception {
  public InvalidAuthorException(String errorMessage) {
    super(errorMessage);
  }
}
