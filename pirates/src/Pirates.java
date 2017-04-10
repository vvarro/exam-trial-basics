import java.util.*;

public class Pirates {

  static class Pirate {
    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    System.out.println(PirateList(pirates).toString());
  }

  public static List<Pirate> PirateList(List<Pirate> pirates) {
    List<Pirate> richPirate = new ArrayList<>();
    for (Pirate list : pirates) {
      if (list.hasWoodenLeg == true && list.gold > 15) {
        richPirate.add(list);
      }
    }
    return richPirate;
  }
}
