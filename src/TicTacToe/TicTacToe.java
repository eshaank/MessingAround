package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    private char[][] mat;

    private char letter;

    private char[] gameArr;

    private char letterWon;

    public TicTacToe() {

    }

    public TicTacToe(String game) {

        loadGame(game);

    }

    public void loadGame(String game) {

        gameArr = new char[game.length()];

        for (int i = 0; i < game.length(); i++) {

            letter = game.charAt(i);

            gameArr[i] = letter;

        }

        // adding to 2d array

        mat = new char[3][3];

        int index = 0;

        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 3; c++) {

                if (index == gameArr.length) {

                    break;

                }

                mat[r][c] = gameArr[r];

                System.out.print(mat[r][c] + " ");

                index++;

            }

            System.out.println();

        }

    }

    public String getWinner() {

        boolean hasWon = false;

        for (int r = 0; r < mat.length; r++) {

            for (int c = 0; c < mat[0].length; c++) {

            }

        }

        // return letterWon + " has won horizontally";

        return "not won";

    }

    public String toString() {

        String output = "";

        output += getWinner();

        // System.out.println(gameArr);

        return output + "\n\n";

    }

}