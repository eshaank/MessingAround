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
        int i = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                mat[row][col] = gameArr[i];
                System.out.print(mat[row][col] + " ");
                i++;
            }
            System.out.println();

        }

    }

    public String getWinner() {

        // check across
        for (int row = 0; row < mat[0].length; row++) {
            for (int col = 0; col < mat[0].length - 2; col++) {
                if (mat[row][col] == mat[row][col + 1] && mat[row][col] == mat[row][col + 2] && mat[row][col] == 'X') {
                    return "X wins horizontally";
                }
                if (mat[row][col] == mat[row][col + 1] && mat[row][col] == mat[row][col + 2] && mat[row][col] == 'O') {
                    return "O wins horizontally";
                }
            }
        }

        // check up and down
        for (int row = 0; row < mat.length - 2; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == mat[row + 1][col] && mat[row][col] == mat[row + 2][col] && mat[row][col] == 'X') {
                    return "X wins vertically";
                }
                if (mat[row][col] == mat[row + 1][col] && mat[row][col] == mat[row + 2][col] && mat[row][col] == 'O') {
                    return "O wins vertically";
                }
            }
        }

        // check diagonally
        for (int row = 2; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length - 2; col++) {
                if (mat[row][col] == mat[row - 1][col + 1] && mat[row][col] == mat[row - 2][col + 2]
                        && mat[row][col] == 'X') {
                    return "X wins diagonally";
                }
                if (mat[row][col] == mat[row - 1][col + 1] && mat[row][col] == mat[row - 2][col + 2]
                        && mat[row][col] == 'O') {
                    return "O wins diagonally";
                }
            }
        }

        return "No winner";

    }

    public String toString() {
        String output = "";
        output += getWinner();
        return output + "\n\n";

    }

}