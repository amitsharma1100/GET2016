package session1.assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestFirstComeFirstServe {
	FirstComeFirstServe sampleClass;
	int result[][];
	int arrivalTime[];
	int jobSize[];
	int jobIndex[];
	int jobWaitingTimeIndex[];
	int jobStartedIndex[];
	int jobFinishedIndex[];
	@Before
	public void setUp() throws Exception {
		arrivalTime = new int[]{1, 5, 9, 25};
		jobSize = new int[]{12,7,2,5} ;
		sampleClass = new FirstComeFirstServe();
		result = sampleClass.FCFS(arrivalTime, jobSize);
		jobIndex = new int[4];
		jobWaitingTimeIndex = new int[4];
		 jobStartedIndex = new int[4]; 
		jobFinishedIndex = new int[4];
		for(int i=0; i < arrivalTime.length; i++){
			jobIndex[i] =result[1][i]; 
		}
		for(int i=0; i < arrivalTime.length; i++){
			jobWaitingTimeIndex[i] =result[2][i]; 
		}
		for(int i=0; i < arrivalTime.length; i++){
			jobStartedIndex[i] =result[3][i]; 
		}
		for(int i=0; i < arrivalTime.length; i++){
			jobFinishedIndex[i] =result[4][i]; 
		}
		
	}

	@Test
	public void testFCFS() {
		assertArrayEquals(new int[]{1,2,3,4} , jobIndex);
		assertArrayEquals(new int[]{0,8,11,0} , jobWaitingTimeIndex);
		assertArrayEquals(new int[]{1,13,20,25} , jobStartedIndex);
		assertArrayEquals(new int[]{12,19,21,29} ,jobFinishedIndex );
	}

}