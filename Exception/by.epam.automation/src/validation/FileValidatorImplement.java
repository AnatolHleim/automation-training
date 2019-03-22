package validation;

import exception.FileException;

import java.io.File;

public class FileValidatorImplement implements FileValidator {
  @Override
  public boolean getValidationFile(File path) throws FileException {
    boolean status;
    status=(path == null);
    if(status){
      throw new NullPointerException("Null");
    }
    status=(!path.exists() && !path.isDirectory());
    if (status) {
      throw new FileException("message" + path);
    }
    status=(path.length() == 0);
    if (status) {
      throw new FileException("EMPTY");
    }
    return status;
  }
}


