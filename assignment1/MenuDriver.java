package session5.assignment1;

/**
 * 
 * @author amit
 *
 */
public class MenuDriver {

	public static void main(String[] args) {
		
		//create the first menu
		Menu menu = new Menu();
		
		//ask the user to enter the menu items in main menu
		UserInteractor.getUserInput(menu, "Main Menu");
		
		//initialize the stack and stack pointer to store menus
		Stack.InitializeStack();
		Stack.pointer = 0;
		
		//push the main menu into the stack
		Stack.menu[Stack.pointer] = menu;
		
		//display the menu to the user
		new Display().display(menu, 1);

	}

}