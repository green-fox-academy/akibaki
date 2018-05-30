public class Domino implements Comparable<Domino> {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public int compareTo(Domino o) {
    return getValues()[0]-(o.getValues()[0]);
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}
