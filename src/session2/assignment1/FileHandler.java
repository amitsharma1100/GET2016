package session2.assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
	
	protected Questions handleInput() throws FileNotFoundException,IOException
	{
		Questions questionsObject=new Questions();
		BufferedReader bufferedReader = null;
		try{
		bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Amit\\Documents\\Android Workspace\\OOPS\\src\\session2\\assignment1\\questions.txt"));
		String currentLine="";
		String[] commaSeparatedValues;
		
		while ((currentLine = bufferedReader.readLine()) != null) {
			commaSeparatedValues=currentLine.split("[,.]");
			questionsObject.getQuestionNumber().add(commaSeparatedValues[0].toString().trim());
			questionsObject.getQuestionLabel().add(commaSeparatedValues[1].toString().trim());
			questionsObject.getQuestionType().add(commaSeparatedValues[2].toString().trim());
			if(commaSeparatedValues.length>3)
			{
				questionsObject.getOptions().add(commaSeparatedValues[3].toString().trim());	
			}
			
		}
		}
		catch(IOException exception)
		{
			exception.getMessage();
		}
		finally{
			bufferedReader.close();
		}
		return questionsObject;
		
	}
	
	protected void handleResponses(UserHandler[] userHandlers) throws FileNotFoundException
	{
		if(userHandlers==null)
		{
			return ;
		}
		else
		{
			BufferedWriter writer = null;
			String output="";
			int totalUsers=userHandlers.length;
			for(int index=0;index<totalUsers;index++)
			{
				output+="Participant "+(index+1)+","+userHandlers[index].responses.get(0)+","+userHandlers[index].responses.get(1).toString()+","+userHandlers[index].responses.get(2).toString()+".\n";
			}
			try
			{
			    writer = new BufferedWriter( new FileWriter( "C:\\Users\\Amit\\Documents\\Android Workspace\\OOPS\\src\\session2\\assignment1\\responses.txt"));
			    writer.write( output);

			}
			catch ( IOException e)
			{
			}
			finally
			{
			    try
			    {
			        if ( writer != null)
			        writer.close( );
			    }
			    catch ( IOException e)
			    {
			    }
			}
		}
	}
	

}