import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seconds {
  public static void main(String[] args) {
    System.out.println("Please give me the numbers of your list");
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    while(input.hasNextInt()){
      numbers.add(input.nextInt());
    }
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("Please enter number");
      numbers.set(i, input.nextInt());
    }
  }

  // Create a function that takes a list as a parameter,
  // and returns a new list with every second element from the orignal list
  // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
  Seconds(1,2,3,4,5)

}

  public Seconds(List<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        System.out.println(numbers.get(i));
      }
    }
  }
}
