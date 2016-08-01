package session2.assignment2;

/**
 * 
 * @author Amit
 *
 */
public class AllCandidatesQueue {
	
	// stores the candidates in the order of their rank
	private static Queue<Candidate> allCandidates;
	
	public AllCandidatesQueue() {
		allCandidates=new Queue<Candidate>();
	}

	public static Queue<Candidate> getAllCandidates() {
		return allCandidates;
	}

}
