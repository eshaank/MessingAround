package TicTacToe;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        // tic tac toe test here

        Scanner input = new Scanner(
                new File("D:\\Users\\Eshaan\\Documents\\GitHub\\MessingAround\\src\\TicTacToe\\tictactoe.txt"));

        int size = input.nextInt();

        input.nextLine();

        for (int i = 0; i < size; i++) {
            String game = input.nextLine();
            TicTacToe tic = new TicTacToe(game);
            System.out.println(tic);
        }

    }

}