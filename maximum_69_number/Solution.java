public class Solution {
  public static void main(String[] args) {
    Solution.maximum69Number(9669);
  }

  public static int maximum69Number(int num) {
    char[] digits = String.valueOf(num).toCharArray();

    System.err.println(digits);

    for (int i = 0; i < digits.length; i++) {
      if (digits[i] == '6') {

        digits[i] = '9';

        System.out.println(digits);
        break;
      }
    }

    return Integer.parseInt(new String(digits));
  }
}
