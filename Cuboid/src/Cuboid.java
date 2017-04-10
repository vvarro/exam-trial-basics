public class Cuboid {
  public static void main(String[] args) {
    CreateCuboid cuboid = new CreateCuboid(20, 30, 40);
    System.out.println("The surface of the cuboid is: " + cuboid.getSurface());
    System.out.println("The volume of the cuboid is: " + cuboid.getVolume());
  }
}
