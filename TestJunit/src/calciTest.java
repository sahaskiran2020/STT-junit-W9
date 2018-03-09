import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calciTest {

	@Test
	public void addShouldReturnValue()
	{
		calci c1 = new calci ();
		assertEquals(5, c1.add(3, 2));
	}

}
