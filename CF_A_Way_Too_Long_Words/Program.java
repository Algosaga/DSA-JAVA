/* public class Program {



	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		String word = scanner.nextLine();
		 Program.AWayTooLongWord(num,word);
	}

	public static void AWayTooLongWord(int num, String... words){
		String[] arr = new String[num];
		for (int i = 0; i < arr.length; i++  ){
			String word = words[i];
			if(word.length() < 10){
				arr[i] = word;
			}
			else{
				char firstLetter = word.charAt(0);
				char lastLetter = word.charAt(word.length() - 1);

				int embeddedNum = word.length() - 2;
				 StringBuilder sb = new StringBuilder();

				 sb.append(firstLetter);
				 sb.append(String.valueOf(embeddedNum));
				 sb.append(lastLetter);

				 arr[i] = sb.toString();
			}
		}
		System.out.println(num);
		for(String item : arr){

			System.out.println(item);
		}
	}
}

*/

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the number of words
    int num = scanner.nextInt();
    scanner.nextLine(); // Consume the newline

    // Process each word and print the result
    for (int i = 0; i < num; i++) {
      String word = scanner.nextLine();
      System.out.println(transformWord(word));
    }

    scanner.close(); // Close the scanner
  }

  // Method to transform the word if it is longer than 10 characters
  public static String transformWord(String word) {
    if (word.length() > 10) {
      char firstLetter = word.charAt(0);
      char lastLetter = word.charAt(word.length() - 1);
      int embeddedNum = word.length() - 2;

      // Build the transformed word
      StringBuilder sb = new StringBuilder();
      sb.append(firstLetter);
      sb.append(String.valueOf(embeddedNum));
      sb.append(lastLetter);

      String str = sb.toString();
      return str;
    } else {
      return word;
    }
  }
}
