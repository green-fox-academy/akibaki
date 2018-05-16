import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class CopyFile {
  // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {


    String sourcefileName = "multiplelines.txt";
    String targetfileName = "copyofmultiplelines.txt";
    Path pathsource = Paths.get(sourcefileName);
    Path pathtarget = Paths.get(targetfileName);

    try {
      Files.copy(pathsource, pathtarget);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("srtrhrtj");
//    }
    }
  }
}