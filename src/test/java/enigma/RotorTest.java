package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

	Rotor rotor1 = Rotor.rotorFactory("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z", "E");
	
	@Test
	public void convertForwardTest() {
		int i = 2;
		int result = rotor1.convertForward(i);
		int expectedResult = 2;
		assertEquals(expectedResult, result);
	}
	
}
