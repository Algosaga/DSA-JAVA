import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3};

    System.out.println(Solution.numIdenticalPairs(arr));
  }

  public static int numIdenticalPairs(int[] nums) {
    ArrayList<Integer> array = new ArrayList<Integer>();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          array.add(1);
        }
      }
    }

    return array.size();
  }
}
