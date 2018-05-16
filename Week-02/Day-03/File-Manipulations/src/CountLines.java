import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import java.util.ArrayList;



  public class CountLines {
    public static void main(String[] args) {
//C:\Users\Dell\Desktop\greenfox\akibaki\Week-02\Day-03\File-Manipulations\
      String fileName = "cica.txt";
      Path path = Paths.get(fileName);
      int i=0;

      try {
        List<String> content = Files.readAllLines(path);
        for (String rows : content) {
         // System.out.println(rows);
          i=i+1;
        }
      } catch (IOException e) {
        System.out.println("file doesnt exist");
      }
      System.out.println(i);

      // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    }
  }
