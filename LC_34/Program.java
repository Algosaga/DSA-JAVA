
public class Program {
  public static void main(String[] args) {}

  public int[] searchRange(int[] nums, int target) {
    int[] arr = {-1, -1};

    int firstOccurence = search(target, nums, true);
    int lastOccurence = search(target, nums, false);

    arr[0] = firstOccurence;
    arr[1] = lastOccurence;
// NOTE :- You can refactor it according to your need my code is not usng main function becuase I was working with Leetcode thats why I don't really need to define something main.


    return arr;
  }

  static int search(int target, int[] nums, boolean searchForStart) {
    int start = 0;
    int end = nums.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < nums[mid]) {
        end = mid - 1;
      } else if (target > nums[mid]) {
        start = mid + 1;
      } else {
        ans = mid;
        if (searchForStart) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }


    return ans;
  }

}
