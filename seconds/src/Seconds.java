import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seconds {
  public static void main(String[] args) {
    System.out.println("Please give me the numbers of your list, separeted with ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbers = input.split(", ");
  }


  public static void Seconds(List<Integer> nums) {
    Integer[] nums = new Integer[numbers.size()];
    nums = numbers.toArray(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 1) {
        System.out.println(nums[i] + ", ");
      }
    }
  }
}
