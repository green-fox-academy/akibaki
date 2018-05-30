public class Flower {
  private double waterReserve;
  private String color;


  public double getWaterReserve(){
    return this.waterReserve;
  }

  public String getColor(){
    return this.color;
  }

  public void water(double water){
    this.waterReserve += (0.75 * water);
  }

  public Flower(String color, double waterReserve){
    this.color = color;
    this.waterReserve = waterReserve;
  }

  public boolean needsWater(){
    if (this.waterReserve >= 5){
      return false;
    }
    else{
      return true;
    }
  }

}
