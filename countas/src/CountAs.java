import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountAs {

  private final static String FILE_NAME = "afile.txt";

  public static void main(String[] args) throws IOException {

    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
    Counter(FILE_NAME);
  }

  public static void Counter(String FILE_NAME) throws IOException {
    Path path = Paths.get(FILE_NAME);
    String text;
    text = String.valueOf(Files.readAllLines(path));
    text = text.toLowerCase();
    char[] charArray = text.toCharArray();
    int counter = 0;
    char character = 'a';
    for (int i = 0; i < charArray.length; i++) {
      if (character == charArray[i]) {
        counter += 1;
      }
    }
    System.out.println("The number of a letters in the text:" + counter);
  }
}
