

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class TestJunit {
	
	String message = "hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}

}
