import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  // Write a function that takes a filename as string,
  // open and read it. The file data represents a tic-tac-toe
  // game result. Return 'X'/'O'/'draw' based on which player
  // has winning situation.

  public static void main(String[] args) {
    String fileName = "cica.txt";

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  public static String ticTacResult(String fileName) {
    try {
      Path path = Paths.get(fileName);
      List<String> content = Files.readAllLines(path);
      String result=content.get(0);
      return result;

    } catch (IOException e) {
      return"file doesnt exist";
    }
  }
}
