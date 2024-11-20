public class Program{
	public static void main(String[] args){
		Program.starStair(4);
	}
	
	public static void starStair(int n){
		for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}