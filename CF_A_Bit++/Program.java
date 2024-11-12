import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    scanner.nextLine();

    String[] steps = new String[num];
    for (int i = 0; i < num; i++) {
      steps[i] = scanner.nextLine().trim();
    }
    System.out.println(Program.BitPlusPlus(steps));
    scanner.close();
  }

  public static int BitPlusPlus(String[] steps) {
    int variable = 0;
    for (String step : steps) {

      if (step.contains("++")) {
        variable++;
      } else if (step.contains("--")) {
        variable--;
      }
    }
    return variable;
  }
}
