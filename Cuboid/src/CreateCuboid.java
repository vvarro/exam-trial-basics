public class CreateCuboid {
  int a;
  int b;
  int c;

  public CreateCuboid(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getSurface(){
    int surface = 0;
    surface = 2* (a*b + b*c + c*a);
    return surface;
  }
  public int getVolume(){
    int volume = 0;
    volume = a*b*c;
    return volume;
  }
}
