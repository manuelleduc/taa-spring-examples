package fr.mleduc.without;

public class MultiplyService {
	
	private final RandomSource r = new RandomSource();
	private final TimeSource t = new TimeSource();
	public long multiply() {
		return r.getRandom() * t.getTime();
	}
}
