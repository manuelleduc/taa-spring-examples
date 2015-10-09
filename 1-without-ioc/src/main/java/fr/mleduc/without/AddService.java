package fr.mleduc.without;

public class AddService {
	private final RandomSource r = new RandomSource();
	private final TimeSource t = new TimeSource();

	public long add() {
		return r.getRandom() + t.getTime();
	}
}
