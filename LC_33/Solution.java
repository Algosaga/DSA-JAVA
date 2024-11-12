public class Solution {
  public static void main(String[] args) {
    int[] arr = {8, 9, 2, 3, 4};
    System.out.println(Solution.search(arr, 3));
    System.out.println("This is the peak " + Solution.peakIndexInReversedMountainArray(arr));
  }

  public static int search(int[] nums, int target) {
    int pivotPoint = Solution.peakIndexInReversedMountainArray(nums);
    if (target == nums[pivotPoint]) {
      return pivotPoint;
    }
    int searchingInLeft = Solution.binarySearchForAscending(0, pivotPoint, target, nums);
    int searchingInRight =
        Solution.binarySearchForAscending(pivotPoint + 1, nums.length - 1, target, nums);

    if (searchingInLeft == -1 && searchingInRight == -1) {
      return -1;
    } else if (searchingInLeft != -1) {
      return searchingInLeft;
    } else {
      return searchingInRight;
    }
  }

  public static int peakIndexInReversedMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;

      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (arr[mid] <= arr[start]) {

        end = mid - 1;
      } else {

        start = mid + 1;
      }
    }

    return -1;
  }

  public static int binarySearchForAscending(int start, int end, int target, int[] arr) {
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
