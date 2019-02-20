/**
 * CSci 2101 Data Structures.
 * 
 * The class represents a chess board. The square a8 corresponds to a position
 * [0][0] in the two-dimensional array.
 * 
 * Notations for chess pieces (lower-case letters for white, upper-case letters
 * for black): K,k - king, Q,q - queen, R,r - rook, B,b - bishop, N,n - knight,
 * P,p - pawn
 **/
public class Chess {
	public static void main(String[] args) {
		char[][] chessBoard = new char[8][8];
		initialize(chessBoard);
		addPiece('K', 'a', 8, chessBoard);
		addPiece('p', 'h', 2, chessBoard);
		addPiece('p', 'g', 2, chessBoard);
		addPiece('b', 'h', 8, chessBoard);

		printChessBoard(chessBoard);

	}

	/**
	 * The method sets a chessBoard to an empty one (characters that do not denote a
	 * chess piece)
	 **/
	public static void initialize(char[][] chessBoard) {
		// change it to use + for black squares
		// a1 is a black square
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0) {
					chessBoard[i][j] = ' ';
				} else {
					chessBoard[i][j] = '+';
				}
			}

		}

	}

	/**
	 * print a chess board
	 **/
	public static void printChessBoard(char[][] chessBoard) {
		for (char[] row : chessBoard) {
			for (char square : row) {
				System.out.print(square);
			}
			System.out.println();
		}
	}

	/**
	 * The method adds a chess piece to a chessBoard at a given row and column.
	 **/
	public static void addPiece(char piece, char column, int row, char[][] chessBoard) {
		chessBoard[8 - row][column - 'a'] = piece;
	}

}
