package session2.assignment1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Survey {
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		Questions questions=new FileHandler().handleInput();
		questions.setTotalSingleSelectOptions(questions);
				
		Scanner scanner = null;
		if(questions!=null)
		{
			try{
			scanner=new Scanner(System.in);
			System.out.println("Enter the number of users");	
			int totalUsersInSurvey=scanner.nextInt();
			
			
			UserHandler[] usersArray=new UserHandler[totalUsersInSurvey];
			for(int index=0;index<totalUsersInSurvey;index++)
			{
				usersArray[index]=new UserHandler();
			}
			Display display=new Display(questions);
			for(int index=0;index<totalUsersInSurvey;index++)
			{
				usersArray[index]=display.generateUI(usersArray[index]);
			}
			for(int index=0;index<totalUsersInSurvey;index++)
			{
				System.out.println("user "+(index+1)+" entered:"+usersArray[index].responses.get(0).toString()+" "+usersArray[index].responses.get(1).toString()+" "+usersArray[index].responses.get(2).toString());
			}
			display.generateResult(usersArray, questions.indicesOfSingleSelectQuestion, questions);
			new FileHandler().handleResponses(usersArray);
			}
			catch(IOException ioException)
			{
				ioException.getMessage();
			}
			finally{
				scanner.close();
			}
			
		}
		
		
	}

}