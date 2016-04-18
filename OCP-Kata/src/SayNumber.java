import java.util.Arrays;
import java.util.List;


public class SayNumber {
	
	private List<CheckNumber> checkNumbers;
	
	public SayNumber(CheckNumber ... checkNumbers){
		this.checkNumbers = Arrays.asList(checkNumbers) ;
	}

	public String say(int number){
		String result = "";
		
		for (CheckNumber checkNumber : checkNumbers) {
			result += checkNumber.say(number);
		}		
		
		return "".equals(result) ? NormalNumber.say(number):result;
	}

	
}
