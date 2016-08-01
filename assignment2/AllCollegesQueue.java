package session2.assignment2;

/**
 * 
 * @author Amit
 *
 */
public class AllCollegesQueue {

	// stores details of all colleges in order of their ranks
	private static Queue<College> allColleges;

	public AllCollegesQueue() {
		allColleges = new Queue<College>();
	}

	public static Queue<College> getAllColleges() {
		return allColleges;
	}

	//returns college by rank 
	public static College getCollegeByRank(int rank)
	{
		int totalColleges=allColleges.size();
		for(int index=0;index<totalColleges;index++)
		{
			int currentCollegeRank=allColleges.getValueByIndex(index).getRANK();
			if(currentCollegeRank==rank)
			{
				return allColleges.getValueByIndex(index);
			}
		}
		return null;
	}
}
