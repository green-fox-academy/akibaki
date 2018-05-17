import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Logs {
  // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

    public static void main(String[] args) {
      String fileName = "logs.txt";
      Path path = Paths.get(fileName);
      ArrayList<String> ipAdresses = new ArrayList<>();
      double get=0;

      try {
        List<String> content = Files.readAllLines(path);
        for (int i = 1; i < content.size(); i++) {
          ipAdresses.add( content.get(i).split(" ")[8]);
          if (content.get(i).split(" ")[11].length()==3){
            get+=1.0;
          }
        }
        System.out.println(get/(500.0-get));
        System.out.println(Arrays.asList(ipAdresses));
      } catch (IOException e) {
        System.out.println("there was an IO exception");
      } catch (Exception e) {
        System.out.println("there was an exception");
      }
    }
  }

