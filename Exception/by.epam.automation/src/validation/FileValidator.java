package validation;

import exception.FileException;

import java.io.File;

public interface FileValidator {
  boolean getValidationFile(File currentFile) throws FileException;
}
