package session2.assignment2;

import java.io.IOException;

/**
 * 
 * @author Amit
 *
 */
public class Counsellor {

	public static void main(String[] args) throws IOException {
		FileHandler fileHandler=new FileHandler();
		fileHandler.readCandidateDetails();
		AllCollegesQueue allCollegesQueue=fileHandler.readCollegeDetails();
		CounsellingDisplay counsellingDisplay=new CounsellingDisplay();
		int totalCandidates=AllCandidatesQueue.getAllCandidates().size();
		for(int index=0;index<totalCandidates;index++)
		{
			Candidate candidate=AllCandidatesQueue.getAllCandidates().getValueByIndex(index);
			counsellingDisplay.getCandidatePreferences(candidate, allCollegesQueue);
		}
			
		Counsellor counsellor=new Counsellor();
		counsellor.allocateSeats();
		counsellingDisplay.showCounsellingResults();
		
	}
	/**
	 * allocates the seats to various candidates based on their preferences
	 */
	public void allocateSeats()
	{
		int totalCandidates=AllCandidatesQueue.getAllCandidates().size();
		for(int index=0;index<totalCandidates;index++)
		{
			Candidate candidate=AllCandidatesQueue.getAllCandidates().getValueByIndex(index);
			int totalPreferences=candidate.getCandidateQueueForCollege().size();
			for(int index2=0;index2<totalPreferences;index2++)
			{
				int collegeRank=candidate.getCandidateQueueForCollege().getValueByIndex(index2).getRANK();
				College college=AllCollegesQueue.getCollegeByRank(collegeRank);
				if(college.getTOTAL_SEATS()>0)
				{
					college.setTOTAL_SEATS(college.getTOTAL_SEATS()-1);
					candidate.setCollegeAlloted(college);
					break;
				}
			}
		}
	}
}
