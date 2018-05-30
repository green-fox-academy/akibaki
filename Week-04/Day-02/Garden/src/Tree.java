public class Tree {

  private String color;
  private double waterReserve;

  public double getWaterReserve(){
    return this.waterReserve;
  }

  public String getColor(){
    return this.color;
  }

  public void water(double water){
    this.waterReserve += (0.4 * water);
  }

  public boolean needsWater(){
    if (this.waterReserve >= 10){
      return false;
    }
    else{
      return true;
    }
  }

  public Tree(String color, double waterReserve){
    this.color = color;
    this.waterReserve = waterReserve;
  }


}
