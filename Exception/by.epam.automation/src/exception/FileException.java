package exception;


public class FileException extends Exception {
  public FileException(String message, Throwable cause) {
    super(message, cause);
  }

  public FileException(Throwable cause) {
    super(cause);
  }

  public FileException() {
  }
  public FileException(String message){super(message);}
}
