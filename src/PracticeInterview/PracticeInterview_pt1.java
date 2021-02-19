package PracticeInterview;

public class PracticeInterview_pt1 {
	static char[][] test = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };

	public static void main(String[] args) {
		// System.out.println(test.toString());
		PracticeInterview_pt1 testFunc = new PracticeInterview_pt1();
		testFunc.findWord(test, "z");
	}

	 boolean findWord(char[][] letters, String word) {
		int length = word.length();
		int match = 0;
		for (int row = 0; row < letters.length; row++) {
			for (int col = 0; col < letters.length; col++) {
				if (letters[row][col] == word.charAt(0)) {
					System.out.println("yes");
					return false;
				} else {
					System.out.println("nope");
				}

			}
		}

		return false;
	}
}
