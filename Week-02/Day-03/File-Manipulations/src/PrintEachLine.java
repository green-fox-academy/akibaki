
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
//C:\Users\Dell\Desktop\greenfox\akibaki\Week-02\Day-03\File-Manipulations\
    String fileName = "cica.txt";
    Path path = Paths.get(fileName);
    System.out.println(path);

    try {
      List<String> content = Files.readAllLines(path);
      for (String rows : content) {
        System.out.println(rows);
      }
    } catch (IOException e) {
      System.out.println("file doesnt exist");
    }


    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"


  }
}

