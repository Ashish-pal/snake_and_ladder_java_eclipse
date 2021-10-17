package snakes_and_ladders;

public class Board {

	private int cellCount;

	private BoardPosition[] board;

	public Board() {
		this.cellCount = 100;
		board = new BoardPosition[cellCount];
		generateBoard();
	}

	private void generateBoard() {
		initalizeBoard();
		setupSnakes();
		setupLadders();
	}

	private void initalizeBoard() {
		for (int i = 0; i < cellCount; i++) {
			BoardPosition boardPosition = new BoardPosition(i + 1);
			board[i] = boardPosition;
		}
	}

	private void setupSnakes() {
		int[] position = { 99, 91, 87, 51, 49, 37, 17 };
		int[] snakePosition = { 2, 75, 24, 47, 23, 29, 3 };

		for (int i = 0; i < position.length; i++) {
			BoardPosition boardPosition = board[position[i] - 1];
			boardPosition.setSnakePosition(snakePosition[i]);
		}
	}

	private void setupLadders() {
		int[] position = { 82, 55, 33, 19, 16, 9, 4 };
		int[] ladderPosition = { 97, 63, 83, 80, 25, 39, 14 };

		for (int i = 0; i < position.length; i++) {
			BoardPosition boardPosition = board[position[i] - 1];
			boardPosition.setLadderPosition(ladderPosition[i]);
		}
	}

	public BoardPosition[] getBoard() {
		return board;
	}

	public int getCellCount() {
		return cellCount;
	}
}