import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seconds {
  public static void main(String[] args) {
    System.out.println("Please give me the numbers of your list");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbers = input.split(", ");
    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<Integer> seconds = new ArrayList<>();
    for (String i : numbers) {
      nums.add(Integer.parseInt(i));
    }
    for (Integer i : nums) {
      System.out.println(i);
    }
    Seconds(nums);
  }

  public static void Seconds(List<Integer> nums) {
    List<Integer> seconds = new ArrayList<>();
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 1) {
        seconds.add(nums.get(i));
      }
      System.out.println(seconds.get(i));
    }
  }
}
