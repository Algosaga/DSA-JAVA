import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int a = 0;
    int totalTime = 0;
    for (int i = 1; i <= n; i++) {
      totalTime = totalTime + (5 * i);
      if (k + totalTime <= 240) {
        a++;
      } else {
        break;
      }
    }
    System.out.println(a);
    scanner.close();
  }
}
