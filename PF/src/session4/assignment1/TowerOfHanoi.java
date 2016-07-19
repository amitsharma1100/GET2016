package session4.assignment1;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
	static List<String> outputList;

	
	List<String> getTowerSolution(int numberOfDisks,String start,String auxillary,String destination)
	{
		if(outputList==null)
		{
			outputList=new ArrayList<String>();
		}
		if(numberOfDisks==1)
		{
			outputList.add("Move Disk "+numberOfDisks+" from "+start+" to "+destination);
		}
		else
		{
			getTowerSolution(numberOfDisks-1, start,  destination,auxillary);
			outputList.add("Move Disk "+numberOfDisks+" from "+start+" to "+destination);
			getTowerSolution(numberOfDisks-1,auxillary,start, destination);
		}
		return outputList;
	}
	
	public static void main(String[] args)
	{
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
		List<String> temp=towerOfHanoi.getTowerSolution(2, "A", "B", "C");
		for(int index=0;index<temp.size();index++)
			System.out.println(temp.get(index));
	}
}