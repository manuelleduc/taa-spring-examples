package fr.mleduc.with;

import java.util.Random;

public class RandomSource {

	private final Random r = new Random();

	public long getRandom() {
		return r.nextLong();
	}
}
