public class Program {
  public static void main(String[] args) {
    Program.Watermelon(20);
  }

  public static void Watermelon(int number) {

    if (number > 2 && number % 2 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
