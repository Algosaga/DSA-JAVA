class Solution {

  public int missingNumber(int[] nums) {
    int missingNumber = nums.length;
    int[] arr = Solution.bubbleSort(nums);
    for (int i = 0; i < nums.length; i++) {

      if (i != arr[i]) {
        missingNumber = i;
        break;
      }
    }
    return missingNumber;
  }

  public static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }
}
