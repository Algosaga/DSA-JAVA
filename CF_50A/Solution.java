 import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		System.out.println(Solution.dominoPiling(M,N));
		scanner.close();
	}
	public static int dominoPiling(int m, int n){
		return m * n / 2;
	}
}