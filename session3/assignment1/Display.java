package session3.assignment1;

public class Display {

	//contains the state of the game at a particular instance
	private String[][] state;

	public Display()
	{
		//initialize the state[][] array
		this.state=new String[3][3];
		for(int row=0;row<3;row++)
		{
			for(int column=0;column<3;column++)
			{
				this.getState()[row][column]=" ";
			}
		}
	}
	/*getter for state[][]*/
	public String[][] getState() {
		return state;
	}

	public void setState(String[][] state) {
		this.state = state;
	}
	
	/*display the game state*/
	public void diplayState(String player)
	{
		System.out.println("****After "+player+" move****\n");
		for(int row=0;row<3;row++)
		{
			for(int column=0;column<3;column++)
			{
				System.out.print("   "+state[row][column]+"  |");
			}
			System.out.println();
			System.out.println("-----------------------");
			
			
		}
	}
	
	
}
