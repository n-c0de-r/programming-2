package uebung3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaschenrechnerTest {

	@Test
	public void addiereTest() {
		assertEquals(4, Taschenrechner.addiere(2, 2));
		assertEquals(1, Taschenrechner.addiere(0.5, 0.5));

	}

	@Test
	void multiTest() {
		assertEquals(8, Taschenrechner.multipliziere(2, 4));
		assertEquals(5, Taschenrechner.multipliziere(2.5, 2));
	}

}
