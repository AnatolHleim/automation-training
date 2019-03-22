package parser;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataParser {
  private Stream<String> fileStream;

  public DataParser() {
  }

  public  List<Double> filter(List<String> dataString){
    return dataString.stream()
            .parallel()
           .filter(Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?").asPredicate())
            .map(Double::valueOf)
            .collect(Collectors.toList());
  }
}
