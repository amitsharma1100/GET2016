package session3.assignment1;

public class Validations {

	//game board dimensions
	private static final int ROWS = 3;
	private final int COLUMNS = 3;

	public static int getROWS() {
		return ROWS;
	}

	public int getCOLUMNS() {
		return COLUMNS;
	}

	/*returns true for a valid move */
	public boolean isMoveValid(int row, int column, String[][] state) {
		boolean status = true;

		if ((row > ROWS + 1) || column > (COLUMNS + 1)
				|| state[row - 1][column - 1].equalsIgnoreCase("X")
				|| state[row - 1][column - 1].equalsIgnoreCase("0")) {
			status = false;
		}

		return status;
	}
/*checks if the symbol entered by the user is valid or not*/
	public boolean isSymbolValid(String symbol) {
		boolean status = false;
		if (symbol.equalsIgnoreCase("X") || symbol.equalsIgnoreCase("0")) {
			status = true;
		}
		return status;
	}

	/*returns the result after each move
	 the result can be 'continue' if the game has either no winner or not ended
	 it can be 'win' if one of the player wins
	 it can be 'gameover if no player wins'*/
	public String getResult(String[][] state) {

		if (isGameOver(state).equalsIgnoreCase("yes")) {
			return "gameover";
		}
		String result = "continue";
		if (checkRow(state).equalsIgnoreCase("win")
				|| checkColumn(state).equalsIgnoreCase("win")
				|| checkLeftDiagonal(state).equalsIgnoreCase("win")
				|| checkRightDiagonal(state).equalsIgnoreCase("win")) {
			return "win";
		}

		return result;
	}

	/*checks the validity of a move in each row*/
	public String checkRow(String[][] state) {
		String result = "";
		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++) {
			String symbol = "x";
			if (state[rowIndex][0].equalsIgnoreCase(symbol)
					&& state[rowIndex][1].equalsIgnoreCase(symbol)
					&& state[rowIndex][2].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			} else {
				symbol = "0";
				if (state[rowIndex][0].equalsIgnoreCase(symbol)
						&& state[rowIndex][1].equalsIgnoreCase(symbol)
						&& state[rowIndex][1].equalsIgnoreCase(symbol)) {
					result = "win";
					return result;
				}
			}
		}
		return result;

	}

	/*checks the validity of a move in each column*/
	public String checkColumn(String[][] state) {
		String result = "";
		for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
			String symbol = "x";
			if (state[0][columnIndex].equalsIgnoreCase(symbol)
					&& state[1][columnIndex].equalsIgnoreCase(symbol)
					&& state[2][columnIndex].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			} else {
				symbol = "0";
				if (state[0][columnIndex].equalsIgnoreCase(symbol)
						&& state[1][columnIndex].equalsIgnoreCase(symbol)
						&& state[2][columnIndex].equalsIgnoreCase(symbol)) {
					result = "win";
					return result;
				}
			}
		}
		return result;
	}

	/*checks the validity of a move in left diagonal*/
	public String checkLeftDiagonal(String[][] state) {
		String result = "";

		String symbol = "x";
		if (state[0][0].equalsIgnoreCase(symbol)
				&& state[1][1].equalsIgnoreCase(symbol)
				&& state[2][2].equalsIgnoreCase(symbol)) {
			result = "win";
			return result;
		} else {
			symbol = "0";
			if (state[0][0].equalsIgnoreCase(symbol)
					&& state[1][1].equalsIgnoreCase(symbol)
					&& state[2][2].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			}
		}

		return result;
	}
	/*checks the validity of a move in right diagonal*/
	public String checkRightDiagonal(String[][] state) {
		String result = "";

		String symbol = "x";
		if (state[0][2].equalsIgnoreCase(symbol)
				&& state[1][1].equalsIgnoreCase(symbol)
				&& state[2][0].equalsIgnoreCase(symbol)) {
			result = "win";
			return result;
		} else {
			symbol = "0";
			if (state[0][2].equalsIgnoreCase(symbol)
					&& state[1][1].equalsIgnoreCase(symbol)
					&& state[2][0].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			}
		}

		return result;
	}

	/*check if the game is over*/
	public String isGameOver(String[][] state) {
		String status = "yes";
		outerloop: for (int rowIndex = 0; rowIndex < ROWS; rowIndex++) {
			for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
				if (state[rowIndex][columnIndex].equalsIgnoreCase(" ")) {
					status = "no";
					break outerloop;
				}
			}
		}

		return status;

	}
}
