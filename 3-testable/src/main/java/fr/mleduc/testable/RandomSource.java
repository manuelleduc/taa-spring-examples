package fr.mleduc.testable;

import java.util.Random;

public class RandomSource implements IRandomSource {

	private final Random r = new Random();

	@Override
	public long getRandom() {
		return r.nextLong();
	}
}
