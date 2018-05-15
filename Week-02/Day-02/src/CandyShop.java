import java.util.*;

public class CandyShop {
  public static void main(String... args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }


  public static ArrayList<Object> sweets(ArrayList<Object> arraylist) {
    for (int i = 0; i < arraylist.size(); i++) {
      if (arraylist.get(i).equals(2)) {
        arraylist.set(i,"Croissant");
      }
      if (arraylist.get(i).equals(false)) {
        arraylist.set(i,"Ice cream");
      }
    }
    return arraylist;
  }
}
