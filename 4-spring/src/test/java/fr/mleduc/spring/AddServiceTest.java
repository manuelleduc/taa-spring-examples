package fr.mleduc.spring;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.mleduc.spring.AddService;

public class AddServiceTest {

	@Test
	public void testEqualOneHundred() {
		final AddService multiplyService = new AddService();
		multiplyService.setRandomSource(() -> 0);
		multiplyService.setTimeSource(() -> 100);
		assertEquals(100, multiplyService.add());

	}

	@Test
	public void testEqualOneHunderAndOne() {
		final AddService multiplyService = new AddService();
		multiplyService.setRandomSource(() -> 1);
		multiplyService.setTimeSource(() -> 100);
		assertEquals(101, multiplyService.add());
	}
}
