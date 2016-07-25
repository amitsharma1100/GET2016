package session3.assignment1;

public class Computer {
	
	private Symbols symbols;
	private final String PLAYER_NAME="Computer";
	
	public Computer()
	{
		this.symbols=new Symbols();
	}
	
	public void setSymbol(String symbol)
	{
		this.symbols.setSymbol(symbol);
	}

	public int[] generatePosition(String[][] state)
	{
		int[] output=new int[2];
		boolean toContinue=true;
		int row=0;
		int column=0;
		while(toContinue)
		{
			row=1 + (int)(Math.random() * ((3 - 1) + 1));
			column=1 + (int)(Math.random() * ((3 - 1) + 1));
			if(state[row-1][column-1].equalsIgnoreCase(" "))
			{
				toContinue=false;
			}
		}
		
		output[0]=row;
		output[1]=column;
		return output;
		
	}
	
	public void getComputerMove(String[][] state)
	{
		int[] rowAndColumn=new int[2];
		rowAndColumn=generatePosition(state);
		state[rowAndColumn[0]-1][rowAndColumn[1]-1]=this.getSymbols().getSymbol();
	}

	public Symbols getSymbols() {
		return symbols;
	}

	public void setSymbols(Symbols symbols) {
		this.symbols = symbols;
	}

	public String getPLAYER_NAME() {
		return PLAYER_NAME;
	}
	
	
}
