import java.util.List;

public class Seconds {
  public static void main(String[] args) {

    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
  }
  public Seconds(List<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        System.out.println(numbers.get(i));
      }
    }
  }
}
