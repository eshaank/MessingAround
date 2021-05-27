package TicTacToe;

import java.io.File;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        // // tic tac toe test here

        // Scanner input = new Scanner(
        // new
        // File("D:\\Users\\Eshaan\\Documents\\GitHub\\MessingAround\\src\\TicTacToe\\tictactoe.txt"));

        // int size = input.nextInt();

        // input.nextLine();

        // for (int i = 0; i < size; i++) {
        // String game = input.nextLine();
        // TicTacToe tic = new TicTacToe(game);
        // System.out.println(tic);

        // }
        // StringBuilder newStr = new StringBuilder("str");
        // for (int i = 0; i < 3; i++) {
        // newStr.setCharAt(i, 'c');
        // }
        // String str = "test";
        // String test = str.trim();
        // System.out.println(test);

        int[] arr = { 4, 5, 2, 6, 1, 4, 5, 6, 3 };
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 10));
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        
        System.out.println(1 + 2 + " hi");
    }

    // public static String[] wave(String str) {
    // String[] arrStr = new String[str.length()];
    // for (int i = 0; i < arrStr.length - 1; i++) {
    // arrStr[i] = str.substring(i, i + 1).toUpperCase();

    // }
    // return arrStr;
    // }

}