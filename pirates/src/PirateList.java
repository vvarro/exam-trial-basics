import java.util.ArrayList;

public class PirateList {
  public PirateList() {
  }

  public ArrayList<String> PirateFinder(ArrayList<Pirates.Pirate> pirates) {
    ArrayList<String> richPirate = new ArrayList<>();
    for (Pirates.Pirate list : pirates) {
      if (list.hasWoodenLeg == true && list.gold > 15) {
        richPirate.add(list.name);
      }
    }
    return richPirate;
  }
}
