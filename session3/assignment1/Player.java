package session3.assignment1;

import java.util.Scanner;

public class Player {

	private static Scanner scanner;
	private Symbols symbols;

	public Symbols getSymbols() {
		return symbols;
	}

	public void setSymbols(Symbols symbols) {
		this.symbols = symbols;
	}

	public Player() {
		this.symbols = new Symbols();
		scanner = new Scanner(System.in);
	}

	/* sets symbol for player 1 */
	public void setSymbol() {
		System.out.println("Player 1 ,choose your symbol....'X' or '0'");
		scanner = new Scanner(System.in);
		String symbol1 = scanner.next();

		Validations validations = new Validations();
		if (validations.isSymbolValid(symbol1)) {
			this.symbols.setSymbol(symbol1);
		} else {
			System.out.println("Player 1,please enter a valid symbol");
			this.setSymbol();
		}
	}

	public void setSymbol(String symbol) {
		this.symbols.setSymbol(symbol);
	}

	/* take input from the user for the move */
	public void getMove(String playerName,String[][] state,Player player) {
		boolean toContinueForRow=true;
		boolean toContinueForColumn=true;
		int row = 0;
		int column = 0;
		while(toContinueForRow)
		{
			System.out.println(playerName+" enter the row");
			String input = scanner.next();
			if (isRowColumnValid(input)) {
				row = Integer.parseInt(input);
				toContinueForRow=false;
			} 
			else{
				System.out.println("Enter a correct row");
			}
			
		}
	
		
		while(toContinueForColumn)
		{
			System.out.println(playerName+" enter the column");
			String input = scanner.next();
			if (isRowColumnValid(input)) {
				column = Integer.parseInt(input);
				toContinueForColumn=false;
			} 
			else{
				System.out.println("Enter a correct column");
			}
			
		}
		
		Validations validations = new Validations();
		if (!validations.isMoveValid(row, column, state)) {
			System.out.println("Player enter a valid move");
			getMove(playerName,state,player);
		} else {
			state[row - 1][column - 1] = player.getSymbols().getSymbol();

		}

	}

	/*checks if the row number and column entered by the user is valid or not*/
	public boolean isRowColumnValid(String input) {
		boolean status = true;
		if (input.length() > 1) {
			status = false;
		} else {
			int temp = input.codePointAt(0);
			if (temp < 47 || temp > 51) {
				status = false;
			}
		}
		return status;
	}

	/* free up the resources */
	public void freeResources() {
		scanner.close();
	}

}
