import java.util.ArrayList;

public class Garden {

  public static ArrayList<Flower> flowers = new ArrayList<>();
  public static ArrayList<Tree> trees = new ArrayList<>();

  public static void main(String[] args) {

    addFlower(new Flower( "yellow", 3));
    addFlower(new Flower( "blue", 3));
    addTree(new Tree( "purple", 3));
    addTree(new Tree( "orange", 3));

    report(flowers, trees);
  }


  public static void report (ArrayList<Flower> flowers, ArrayList<Tree> trees) {
    String needs = "";
    for (Flower flower : flowers) {
      needs = (flower.needsWater()) ?  "needs" :  "doesnt need ";
      System.out.println("The " + flower.getColor() + " Flower " + needs + "water.");
    }

    for (Tree tree : trees) {
      needs = (tree.needsWater()) ?  "needs" :  "doesnt need ";
      System.out.println("The " + tree.getColor() + " Tree " + needs + "water.");
    }
  }


  public static void addTree(Tree tree){
    trees.add(tree);
  }

  public static void addFlower(Flower flower){
    flowers.add(flower);
  }
}
