package session2.assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * 
 * @author Amit
 *
 */
public class FileHandler {

	/**
	 * reads the candidates' details from files
	 * @return
	 * @throws IOException
	 */
	public AllCandidatesQueue readCandidateDetails() throws IOException
	{
	AllCandidatesQueue allCandidatesQueue=new AllCandidatesQueue();
	BufferedReader bufferedReader=null;
	try {
		 bufferedReader= new BufferedReader(new FileReader("C:\\Users\\admin\\workspace\\DS\\src\\session2\\assignment2\\candidates.txt"));
		String currentLine = "";
		String[] commaSeparatedValues;
		while ((currentLine = bufferedReader.readLine()) != null) {
			commaSeparatedValues = currentLine.split(",");
			String candidateName=commaSeparatedValues[0];
			int candidateRank=Integer.parseInt(commaSeparatedValues[1]);
			Candidate candidate=new Candidate();
			candidate.setName(candidateName);
			candidate.setCANDIDATE_RANK(candidateRank);
			AllCandidatesQueue.getAllCandidates().enqueue(candidate);
		}
		} catch (FileNotFoundException fileNotFoundException) {
		System.out.println("The file could not be found "+fileNotFoundException.getMessage());

	}
	finally{
		if(bufferedReader!=null)
		{
			bufferedReader.close();
		}
	}
	return allCandidatesQueue;
	}
	
	public static void main(String[] args) throws IOException
	{
		FileHandler fileHandler=new FileHandler();
		fileHandler.readCandidateDetails();
		fileHandler.readCollegeDetails();
	}
	
	/**
	 * reads the college's details from file
	 * @return
	 * @throws IOException
	 */
	public AllCollegesQueue readCollegeDetails() throws IOException
	{
	
	BufferedReader bufferedReader=null;
	AllCollegesQueue allCollegesQueue=new AllCollegesQueue();
	try {
		 bufferedReader= new BufferedReader(new FileReader("C:\\Users\\admin\\workspace\\DS\\src\\session2\\assignment2\\colleges.txt"));
		String currentLine = "";
		String[] commaSeparatedValues;
		
		while ((currentLine = bufferedReader.readLine()) != null) {
			commaSeparatedValues = currentLine.split(",");
			String collegeName=commaSeparatedValues[0];
			int collegeRank=Integer.parseInt(commaSeparatedValues[1]);
			College college=new College();
			college.setCollegeName(collegeName);
			college.setCOLLEGE_RANK(collegeRank);
			college.setTOTAL_SEATS(Integer.parseInt(commaSeparatedValues[2]));
			AllCollegesQueue.getAllColleges().enqueue(college);
		}
		
	} catch (FileNotFoundException fileNotFoundException) {
		System.out.println("The file could not be found "+fileNotFoundException.getMessage());

	}
	finally{
		if(bufferedReader!=null)
		{
			bufferedReader.close();
		}
	}
	return allCollegesQueue;
	}
}
