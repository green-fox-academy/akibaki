public class ToDoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";

    // Add "My todo:" to the beginning of the todoText
    todoText="My todo:\n"+todoText;
    // Add " - Download games" to the end of the todoText
    todoText+=" - Download games\n";
    // Add " - Diablo" to the end of the todoText but with indention
    todoText+="     - Diablo";

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    System.out.println(todoText);
  }
}
