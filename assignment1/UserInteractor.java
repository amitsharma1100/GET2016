package session5.assignment1;

import java.util.Scanner;

/**
 * 
 * @author amit
 *
 */
public class UserInteractor {
	
	/**
	 * 
	 * @param menu takes the user input for a given menu
	 * @param menuLabel  denotes the text of the menu
	 */
	public static void getUserInput(Menu menu,String menuLabel)
	{
		boolean toContinue=false;
		int totalMenuItems=0;
        String input="";
        Scanner scanner=new Scanner(System.in);
        
        //take user input for total menu items in the menu until a correct choice is not entered 
		while(!toContinue)
		{
			System.out.println("Enter the no of menu items for "+menuLabel);
			input=scanner.next();
			toContinue=UserInteractor.isInputValid(input);
			if(!toContinue)
			{
				System.out.println("Please enter a valid choice");
			}
		}
		totalMenuItems=Integer.parseInt(input);
		
		//user inputs names of total menu items 
		for(int index=0;index<totalMenuItems;index++)
		{
			System.out.println("Enter the name for menuitem "+(index+1)+" for "+menuLabel);
			String menuitemLabel=scanner.nextLine();
			MenuItem menuItem=new MenuItem();
			menuItem.setLabel(menuitemLabel);
			
			//ask the user if the entered menu item itself contains sub menu
			System.out.println("Does "+menuitemLabel+" contains submenu?\n Press 'y' or 'n'");
			String response=scanner.nextLine();
			if(response.equalsIgnoreCase("y"))
			{
				menuItem.setType(Constants.TYPE_IS_MENU);
				//Menu subMenu=new Menu();
				UserInteractor.getUserInput(menuItem.menu,menuitemLabel);
			}
			else
			{
				menuItem.setType(Constants.TYPE_IS_NON_MENU);
			}
			menu.getMenuItems().add(menuItem);
			
		}
		
		//enter a menu item back after each menu item list
		MenuItem menuBack=new MenuItem("Back",Constants.TYPE_IS_BACK);
		menu.getMenuItems().add(menuBack);
		
		
	}
	/**
	 * 
	 * @param input denotes the data entered by the user 
	 * @return returns true if the data entered is a number
	 */
	public static boolean isInputValid(String input)
	{
		boolean status=true;
		if(input.length()>1 || input.codePointAt(0)<48 || input.codePointAt(0)>57)
		{
			status=false;
		}
		
		return status;
	}

}