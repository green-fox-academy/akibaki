import java.util.*;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    //Map<Domino, Domino> map = new HashMap<Domino, Domino>();

    //map.put(dominoes[1], "run around and desert you");

    for (int i = 0; i <dominoes.size() ; i++) {
      for (int j = i+1; j < dominoes.size(); j++) {
        if (dominoes.get(j).getValues()[0] == dominoes.get(i).getValues()[1]) {
          Collections.swap(dominoes, i+1, j);
          j=dominoes.size()+1;
        }
      }
    }





    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
