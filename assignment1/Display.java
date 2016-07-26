package session5.assignment1;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author amit
 *
 */
public class Display {
	
	/**
	 * 
	 * @param menu denotes the menu to be printed on the console
	 * @param level denotes the level of the whole system
	 */
	public void display(Menu menu,int level)
	{
		try{
		List<MenuItem> menuItemList=menu.getMenuItems();
		int totalMenuItems=menuItemList.size();
		for(int index=0;index<totalMenuItems;index++)
		{
			System.out.println((index+1+" ")+menuItemList.get(index).getLabel());
			
		}
		int userInput = 0;
		String input="";
		boolean toContinue=false;
		//take user input to perform action-move forward move backward or exit
		while(!toContinue)
		{
			System.out.println("Please choose an option");
			input=new Scanner(System.in).next();
			toContinue=Display.isInputValid(input, Constants.TYPE_IS_NUMBER_INPUT, totalMenuItems);
		}
		userInput=Integer.parseInt(input);
		if(menuItemList.get(userInput-1).getType()==Constants.TYPE_IS_MENU)
		{
			Stack.pointer+=1;
			Stack.menu[Stack.pointer]=menu;
			display(menuItemList.get(userInput-1).menu,level+1);
		}
		else if(menuItemList.get(userInput-1).getType()!=Constants.TYPE_IS_MENU && menuItemList.get(userInput-1).getType()!=Constants.TYPE_IS_BACK)
		{
		System.out.println("There is nothing to display in the chosen option");	
		display(menu, level);
		}
		else if(menuItemList.get(userInput-1).getType()==Constants.TYPE_IS_BACK && level==1)
		{
		 System.exit(-1);
		}
		else if(menuItemList.get(userInput-1).getType()==Constants.TYPE_IS_BACK && level!=1)
				{
			     Stack.pointer-=1;
			     display(Stack.menu[Stack.pointer+1], level-1);
				}
		}
		catch(Exception exception)
		{
			System.out.println("Sorry something went wrong \n"+exception.getMessage());
		}
	}
	
	/**
	 * 
	 * @param input- represents the input string entered by the user
	 * @param type-type can be either a number input or string input
	 * @param length
	 * @return
	 */
	public static boolean isInputValid(String input,int type,int length)
	{
		boolean status=true;
		if((type==Constants.TYPE_IS_NUMBER_INPUT && (input.length()>1 || input.codePointAt(0)<48 || input.codePointAt(0)>57 || Integer.parseInt(input)>length)) ||(type==Constants.TYPE_IS_STRING_INPUT && input.length()==0))
		{
				status=false;
		
		}
		return status;
	}

}