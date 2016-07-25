package session3.assignment1;

import java.util.Scanner;

/*creates objects and calls corresponding methods*/
public class MainClass {

	private static int GAME_MODE;
	Scanner scanner;
	public static void main(String[] args) {
		
		new MainClass().chooseGameMode();
		Computer computer = null ;
		Player player2=null;

		// create player 1
		Player player = new Player();
		
		if(GAME_MODE==2)
		{
			// create player 1
			player2= new Player();
		}

		// assign symbol for player1
		player.setSymbol();
		String symbol1 = player.getSymbols().getSymbol();

		// assign symbol to computer
		String symbol2 = "";
		Validations validations = new Validations();
		Display display = new Display();
		if (symbol1.equalsIgnoreCase("x")) {
			symbol2 = "0";
		} else {
			symbol2 = "X";
		}
		if(GAME_MODE==1)
		{
			computer= new Computer();
			computer.setSymbol(symbol2);
		}
		else
		{
			player2.setSymbol(symbol2);
		}
		

		// begin game and continue until game gets over or one of the player
		// wins
		String status = "continue";
		while (status.equalsIgnoreCase("continue")) {
			// ask player to make a move
			player.getMove("Player 1",display.getState(),player);

			// display the move if it is a valid move
			display.diplayState("Player 1");

			// check what the result is after player 1 makes a valid move
			status = validations.getResult(display.getState());

			// continue if the game has not ended
			if (status.equalsIgnoreCase("continue")) {
				// ask player 2 to make a move
				if(GAME_MODE==1){
				computer.getComputerMove(display.getState());
				// display the move if it is a valid move
				display.diplayState(computer.getPLAYER_NAME());
				}
				else{
					player2.getMove("Player 2",display.getState(),player2);
					display.diplayState("Player 2");
				}
				
				// check what the result is after player 2 makes a valid move
				status = validations.getResult(display.getState());

				// if the result is win then player 2 wins
				if (status.equalsIgnoreCase("win")) {
					if(GAME_MODE==1)
					{
						System.out.println("*****************Computer Wins******************");	
					}
					else{
						System.out.println("*****************Player 2 Wins******************");
					}
					
				}
			}

			// if the result is win then player 1 wins
			else if (status.equalsIgnoreCase("win")) {
				System.out.println("*****************Player 1 Wins******************");
			}

			// when the result is gameover
			else if (status.equalsIgnoreCase("gameover")) {
				System.out.println("Sorry No One wins....Gameover");
			}
		}

		// finally free the resources
		new Player().freeResources();

	}
	public void chooseGameMode()
	{
		System.out.println("Please choose mode of game\n\t1.  1 Player\n\t2.  2 Players");
		scanner=new Scanner(System.in);
		String input=scanner.next();
		if(input.equalsIgnoreCase("1"))
		{
			MainClass.GAME_MODE=1;
		}
		else if(input.equalsIgnoreCase("2"))
		{
			MainClass.GAME_MODE=2;
		}
		else
		{
			chooseGameMode();
		}
		
	}

}
