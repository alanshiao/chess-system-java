package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int columns) {
		this.row = row;
		this.column = columns;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumns() {
		return column;
	}

	public void setColumns(int columns) {
		this.column = columns;
	}
	
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
