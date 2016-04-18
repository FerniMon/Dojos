import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class SayNumberTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	private SayNumber sayNumber;
	
	@Before
	public void setup(){
		sayNumber = new SayNumber(new FizzNumber(), new BuzzNumber());
	}

	@Test
	public void sayOne(){
		String actual = sayNumber.say(1);
		assertEquals("1", actual);
	}
	
	@Test
	public void threeSayFizz(){
		String actual = sayNumber.say(3);
		assertEquals("Fizz", actual);
	}
	
	@Test
	public void sixSayFizz(){
		String actual = sayNumber.say(6);
		assertEquals("Fizz", actual);
	}
	
	@Test
	public void fiveSayBuzz(){
		String actual = sayNumber.say(5);
		assertEquals("Buzz", actual);
	}
	
	@Test
	public void fiveTeenSayFizzBuzz(){
		String actual = sayNumber.say(15);
		assertEquals("FizzBuzz", actual);
	}
	
	
}
