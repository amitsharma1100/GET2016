package session2.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Amit
 * This class handles all input/output operations
 *
 */
public class CounsellingDisplay {
	
	/**
	 * 
	 * @param candidate-denotes the candidate for whom the preferences are to be filled
	 * @param allCollegesQueue- contains the queue that stores the details of all the colleges
	 */
	public void getCandidatePreferences(Candidate candidate,AllCollegesQueue allCollegesQueue)
	{
		int totalColleges=AllCollegesQueue.getAllColleges().size();
		Scanner scanner=new Scanner(System.in);
		try{
		displayColleges(allCollegesQueue);
		System.out.println("*****PLEASE CHOOSE YOUR PREFERENCES*****");
		System.out.println("Name : "+candidate.getName());
		List<Integer> tempPreferencesList=new ArrayList<Integer>();
		tempPreferencesList.clear();
		for(int index=0;index<totalColleges;index++)
		{
			Boolean toContinue=true;
			int preference=0;
			while(toContinue)
			{
				System.out.println("Enter your "+(index+1)+" choice");
				preference=scanner.nextInt();
			
				if(tempPreferencesList.contains(preference))
				{
					System.out.println("You have already opted this preference");
				}
				else
				{
					tempPreferencesList.add(preference);
					toContinue=false;
				}
			}
			
			candidate.getCandidateQueueForCollege().enqueue(getCollegeByRank(preference, allCollegesQueue));
		}
		}
		catch(Exception exception)
		{
			System.out.println("Something went wrong : "+exception.getMessage());
		}
		finally{
			if(scanner!=null)
			{
				//scanner.close();
			}
		}
	}
	
	/**
	 * 
	 * @param rank -denotes the rank whose college is to be searched
	 * @param allCollegesQueue
	 * @return
	 */
	public College getCollegeByRank(int rank,AllCollegesQueue allCollegesQueue)
	{
		College college=null;
		int totalColleges=AllCollegesQueue.getAllColleges().size();
		for(int index=0;index<totalColleges;index++)
		{
			if(AllCollegesQueue.getAllColleges().getValueByIndex(index).getCOLLEGE_RANK()==rank)
			{
				college=AllCollegesQueue.getAllColleges().getValueByIndex(index);
				break;
			}
		}
		return college;
	}
	
	/**
	 * Displays the list of available colleges 
	 * @param allCollegesQueue
	 */
	public void displayColleges(AllCollegesQueue allCollegesQueue)
	{
		int size=AllCollegesQueue.getAllColleges().size();
		System.out.println("Name\tRank");
		for(int index=0;index<size;index++)
		{
			College college=(College)AllCollegesQueue.getAllColleges().getValueByIndex(index);
			System.out.println(college.getCollegeName()+"\t"+college.getCOLLEGE_RANK());
		}
	}
	
	/**
	 * displays the results of the counselling process
	 */
	public void showCounsellingResults()
	{
		int totalCandidates=AllCandidatesQueue.getAllCandidates().size();
		System.out.println("Name : \t\tAlloted College");
		for(int index=0;index<totalCandidates;index++)
		{
			Candidate candidate=AllCandidatesQueue.getAllCandidates().getValueByIndex(index);
			College college=candidate.getCollegeAlloted();
			String collegeName="No College Alloted";
			if(college!=null)
			{
				collegeName=college.getCollegeName();
			}
			System.out.println(candidate.getName()+"\t\t"+collegeName);
		}
	}

}
