package week_08_08_2022;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(checkPerfect(6));
		System.out.println(checkPerfect(28));
		System.out.println(checkPerfect(496));
		System.out.println(checkPerfect(12));
		System.out.println(checkPerfect(97));
	}

	public static boolean checkPerfect(int numToCheck) {
		int currNum = 1;
		int sum = 0;
		
		while (currNum <= (numToCheck / 2)) {
			if (numToCheck % currNum == 0) {
				sum += currNum;
			}
			currNum++;
		}
		
		if (sum == numToCheck) {
			return true;
		} else {
			return false;
		}
	}
}
