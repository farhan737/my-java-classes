package farhan.experiments.applications;

import java.util.Scanner;

public class TicTacToe {
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char currentPlayer = 'X';
	static Scanner sc = new Scanner(System.in);
	static int row = 0;
	static int col = 0;
	static int count = 0;

	public static void displayBoard() {
		for (char a[] : board) {
			for (int i = 0; i < a.length; i++) {
				System.out.print("[" + a[i] + "]");
			}
			System.out.println();
		}
	}

	public static void playGame() {
		while (true) {
			if (count == 9) {
				System.out.println("DRAWED. the game has ended.");
				return;
			}
			displayBoard();
			System.out.println("current player: " + currentPlayer);
			System.out.println("enter position: ");
			try {
				row = sc.nextInt();
				col = sc.nextInt();
			} catch (ArrayIndexOutOfBoundsException e) {
				playGame();
			}
			if (board[row][col] == ' ')
				board[row][col] = currentPlayer;
			else {
				System.out.println("already occupied!!");
				playGame();
			}

			if (hasWon()) {
				displayBoard();
				System.out.println("the player " + currentPlayer + " has won !!");
				return;
			}
			currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			count++;
		}
	}

	public static boolean hasWon() {
		// row checking
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
				return true;
		}
		// column checking
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
				return true;
		}

		// diagonal checks
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
			return true;
		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
			return true;
		return false;
	}

	public static void main(String[] args) {
		playGame();
	}
}
