 import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		
		while(numberOfTestCases-- > 0){
			long totalSquares = 0;
			int numberOfBuckets = scanner.nextInt();
			
			for (int j = 0; j < numberOfBuckets; j++){
				
				int someSqures = scanner.nextInt();
				
				totalSquares += someSqures;
				
			}
			long sqrt = (long) Math.sqrt(totalSquares);
			if (sqrt * sqrt == totalSquares) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
}
		}
		
		
		
		scanner.close();
	}

}