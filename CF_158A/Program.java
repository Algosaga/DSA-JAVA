import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int k = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println(Program.nextRound(k, arr));
  }

  public static int nextRound(int k, int[] arr) {
    int count = 0;
    for (int item : arr) {
      if (item >= arr[k - 1] && item > 0) {
        count++;
      }
    }

    return count;
  }
}
