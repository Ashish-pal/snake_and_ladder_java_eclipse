package snakes_and_ladders;

public class BoardPosition {

	private final int position;

	private int ladderPosition;
	private int snakePosition;

	public BoardPosition(int position) {
		this.position = position;
		this.ladderPosition = 0;
		this.snakePosition = 0;
	}

	public int getLadderPosition() {
		return ladderPosition;
	}

	public String getLadderPositionText() {
		return "Climb to " + ladderPosition;
	}

	public void setLadderPosition(int ladderPosition) {
		this.ladderPosition = ladderPosition;
	}

	public int getSnakePosition() {
		return snakePosition;
	}

	public String getSnakePositionText() {
		return "Slip to " + snakePosition;
	}

	public void setSnakePosition(int snakePosition) {
		this.snakePosition = snakePosition;
	}

	public boolean isLadder() {
		return ladderPosition > 0;
	}

	public boolean isSnake() {
		return snakePosition > 0;
	}

	public int getPosition() {
		return position;
	}
}
