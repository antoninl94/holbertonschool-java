package bookstore.exceptions;

public class InvalidAuthorException extends RuntimeException {
  public InvalidAuthorException(String errorMessage) {
    super(errorMessage);
  }
}
