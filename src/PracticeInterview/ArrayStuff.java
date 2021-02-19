package PracticeInterview;

import javax.swing.JOptionPane;

public class ArrayStuff {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;

		ArrayStuff test = new ArrayStuff();
		test.arrayMaker(row, col);
	}

	void arrayMaker(int r, int c) {

		int rows = 5;
		int columns = 5;

		int[][] array = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = i;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
