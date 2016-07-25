package session2.assignment1;

import java.util.ArrayList;
import java.util.List;

public class ResultsSummary {
	protected void generateResults(UserHandler[] userHandlers,Questions questions)
	{
		int totalUsers=userHandlers.length;
		int totalQuestions=questions.questionNumber.size();
		int countForSingleSelect=0;
		List<String> temp=new ArrayList<String>();
		for(int index=0;index<totalQuestions;index++)
		{
			if(questions.questionType.get(index).toString().equalsIgnoreCase("Single Select"))
			{
				countForSingleSelect++;
				temp.add(index+"");
			}
		}
		int[] arrayForSingleSelect=new int[temp.size()] ;
		for(int i=0;i<temp.size();i++)
		{
			arrayForSingleSelect[i]=Integer.parseInt(temp.get(i).toString());
		}
		
		
			
	}
	
	protected String[][] getPercentages(UserHandler[] userHandlers,String[] options)
	{
		String[][] output=new String[2][options.length];
		int totalUsers=userHandlers.length;
		String[] optionsCount=new String[options.length];
		
		for(int index=0;index<options.length;index++)
		{
			output[0][index]=options[index];
			
		}
		
		for(int index=0;index<totalUsers;index++)
		{
			output[1][index]=(userHandlers[index].responses.get(0));
		}
		
		
		return output;
	}

}
