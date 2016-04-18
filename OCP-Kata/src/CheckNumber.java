
public abstract class CheckNumber {

	protected int baseNumber;
	protected String translation;
	
	
	public String say(int number){
		return passCheck(number)? translation: "";
	}
	
	private Boolean passCheck(int number)
	{
		return number % baseNumber == 0;
	}
	
}
