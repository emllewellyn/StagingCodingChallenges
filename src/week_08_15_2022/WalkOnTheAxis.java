package week_08_15_2022;

public class WalkOnTheAxis {

	public static void main(String[] args) {
		int T = 2;
		int[] N = {1, 2};
		moveOnAxis(T, N);
	}
	
	public static void moveOnAxis(int T, int[] N) {
		for (int i = 0; i < T; i++) {
			int currNum = N[i];
			
			int steps = currNum;
			for (int j = currNum; j > 0; j--) {
				steps += j;
			}
			
			System.out.println(steps);
		}
	}
	
}
