package session1.assignment4;

public class FirstComeFirstServe {

	
	static int indexJob;
	static	int indexWaitingTime;
	static int indexStarted;
	static int indexFinished;
	
	public static void main(String[] args) {
		
		FirstComeFirstServe firstComeFirstServe = new FirstComeFirstServe();
			int[] arrivalTime = {1,5,9,25} ;
			int[] jobSize = {12,7,2,5} ;
			int[][] result ;
			result = firstComeFirstServe.FCFS(arrivalTime,jobSize);
			System.out.println("Job" + "\t" +"Job Arrival Time" + "\t" +
			"Job Waiting Time"+
					"\t"+ "Job Start at" + "\t" + "Job Finished At");
			for(int i=0;i < 4;i++){
				System.out.println(result[1][i] + "\t\t" + arrivalTime[i] +
						"\t\t " + result[2][i] +
						"\t\t\t" + result[3][i] + "\t\t" + result[4][i]);
			}
	}
	
	public int[][] FCFS(int arrivalTime[] , int jobSize[]){
		int[][] result;
		int time;
		indexJob = 1;
		indexWaitingTime = 2;
		indexStarted = 3;
		indexFinished = 4;
		result = new int[5][5] ; 
		time = 0;
		for(int i=0; i < arrivalTime.length ;i++){
			result[indexJob][i] = i+1;
			if(arrivalTime[i] >= time){
				result[indexWaitingTime][i] = 0;
				result[indexStarted][i] = arrivalTime[i];
				result[indexFinished][i] = arrivalTime[i] + jobSize[i] - 1 ;
				time = arrivalTime[i] + jobSize[i] ;
			}else{
				result[indexWaitingTime][i] = time- arrivalTime[i];
				result[indexStarted][i] = time;
				result[indexFinished][i] = time + jobSize[i] - 1 ;
				time = time + jobSize[i] ;
			}
		
		}
		
		return result;
	}
	

}