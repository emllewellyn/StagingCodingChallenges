package week_08_08_2022;

public class QuadraticFormula {
	
	public static void main(String[] args) {
		System.out.println(quadraticEquation(1, 2, -3));
		System.out.println(quadraticEquation(2, -7, 3));
		System.out.println(quadraticEquation(1, -12, -28));
	}
	
	public static int quadraticEquation(int a, int b, int c) {
		return (int) (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
	}

}
