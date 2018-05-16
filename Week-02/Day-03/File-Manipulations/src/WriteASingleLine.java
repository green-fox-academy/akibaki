
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteASingleLine {
    public static void main(String[] args) {
      // Open a file called "my-file.txt"
      // Write your name in it as a single line
      // If the program is unable to write the file,
      // then it should print an error message like: "Unable to write file: my-file.txt"
      String fileName = "my-file.txt";
      Path path = Paths.get(fileName);
      List<String> output = new ArrayList();
      output.add("I am the god");

      try {
        Files.write(path, output);
      } catch (IOException e) {
        System.out.println("Unable to write file: my-file.txt");
        e.printStackTrace();
      }}
}

