package session2.assignment1;


public class Validation {
	
protected boolean isInputValid(String input,String options)
{
	if(options=="")
	{
		return true;
	}
	input=input.toLowerCase();
	options=options.toLowerCase();
	boolean status=true;
	CharSequence charSequence=input;
	if(!options.contains(charSequence))
	{
		status=false;
	}
	return status;
	
}



}
