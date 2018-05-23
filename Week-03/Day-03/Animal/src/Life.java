public class Life {

  public static void main(String[] args) {

    Animal burkus = new Animal();

    System.out.println(burkus.hunger+" and "+burkus.thirst);

    for (int i = 0; i <10; i++) {
      burkus.play();
    }
    System.out.println(burkus.hunger+" and "+burkus.thirst);

    for (int i = 0; i <5; i++) {
      burkus.drink();
    }
    System.out.println(burkus.hunger+" and "+burkus.thirst);
    for (int i = 0; i <15; i++) {
      burkus.eat();
    }
    System.out.println(burkus.hunger+" and "+burkus.thirst);
  }
}
