package reader;

import exception.FileException;
import validation.FileValidator;
import validation.FileValidatorImplement;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;


public class FileDataReader {

  public FileDataReader() {
  }


  public List<String> readDataFromFile(String path){
    File file =new File(path);
    FileValidator validator = new FileValidatorImplement();
    try {
      if(!validator.getValidationFile(file)){
     return Files.readAllLines(new File(path).toPath(),Charset.defaultCharset());}

    } catch (FileException | IOException e) {
      e.printStackTrace();
  }
    return null;
  }
}

