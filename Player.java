package snakes_and_ladders;

public class Player {

	private int boardPosition;

	private final String name;
	private final String marker;

	public Player(String name, String marker) {
		this.name = name;
		this.marker = marker;
		this.boardPosition = 0;
	}

	public int getBoardPosition() {
		return boardPosition;
	}

	public void setBoardPosition(int boardPosition) {
		this.boardPosition = boardPosition;
	}

	public String getName() {
		return name;
	}

	public String getMarker() {
		return marker;
	}
}