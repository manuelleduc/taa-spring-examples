package fr.mleduc.testable;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyServiceTest {

	@Test
	public void testEqualZero() {
		final MultiplyService multiplyService = new MultiplyService();
		multiplyService.setRandomSource(() -> 0);
		multiplyService.setTimeSource(() -> 100);
		assertEquals(0, multiplyService.multiply());

	}

	@Test
	public void testEqualOneHunder() {
		final MultiplyService multiplyService = new MultiplyService();
		multiplyService.setRandomSource(() -> 1);
		multiplyService.setTimeSource(() -> 100);
		assertEquals(100, multiplyService.multiply());
	}

}
