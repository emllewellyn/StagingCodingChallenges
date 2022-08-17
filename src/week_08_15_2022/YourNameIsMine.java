package week_08_15_2022;

public class YourNameIsMine {

	public static void main(String[] args) {
		int T = 3;
		String[] names = {"john", "johanna", "ira", "ira", "kayla", "jayla"};
		isSubsequence(T, names);
	}
	
	public static void isSubsequence(int T, String[] names) {
		for (int i = 0; i < T * 2; i+=2) {
			String firstName = names[i];
			String secondName = names[i+1];
			boolean foundSubsequence = true;
			
			for (int j = 0; j < firstName.length(); j++) {
				boolean foundChar = false;
				char currChar = firstName.charAt(j);
				for (int k = 0; k < secondName.length(); k++) {
					char charToCheck = secondName.charAt(k);
					if (currChar == charToCheck) {
						foundChar = true;
						break;
					}
				}
				
				if (!foundChar) {
					foundSubsequence = false;
					break;
				}
			}
			
			if (foundSubsequence) {
				System.out.println("Yes");
				continue;
			}
			
			for (int j = 0; j < secondName.length(); j++) {
				boolean foundChar = false;
				char currChar = secondName.charAt(j);
				for (int k = 0; k < firstName.length(); k++) {
					char charToCheck = firstName.charAt(k);
					if (currChar == charToCheck) {
						foundChar = true;
						break;
					}
				}
				
				if (!foundChar) {
					foundSubsequence = false;
					break;
				}
			}
			
			if (foundSubsequence) {
				System.out.println("Yes");
				continue;
			} else {
				System.out.println("No");
			}
		}
	}
}
