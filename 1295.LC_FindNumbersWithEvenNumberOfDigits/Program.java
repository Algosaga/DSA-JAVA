import java.util.ArrayList;

public class Program {
  public static void main(String[] args) {
    int[] arr = {12, 345, 2, 6};
    System.out.println(Program.EvenNumbers(arr));
  }

  public static int EvenNumbers(int[] arr) {
    ArrayList<String> list = new ArrayList<>();
    for (int num : arr) {
      String StringedNumber = String.valueOf(num);
      if (StringedNumber.length() % 2 == 0) {
        list.add(StringedNumber);
      }
    }
    return list.size();
  }
}
