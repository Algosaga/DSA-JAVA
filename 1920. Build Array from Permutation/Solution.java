public class Solution {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] val = Solution.buildArray(arr);
        for (int i : val) {
            System.out.println(i);
        }
    }

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
