import java.util.*;
public class MatchMaking {
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girls,ArrayList<String> boys) {
    ArrayList<String> matches = new ArrayList<String>(boys);
    //System.out.println(matches);
    for (int i = 0; i <girls.size() ; i++) {
      matches.add(i*2, girls.get(i));
      //System.out.println(matches);
      }
      matches.remove(girls.size()*2);
    return matches;
  }
}
