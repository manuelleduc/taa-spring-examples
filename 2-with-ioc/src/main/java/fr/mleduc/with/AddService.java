package fr.mleduc.with;

public class AddService {
	private RandomSource r;
	private TimeSource t;

	public long add() {
		return r.getRandom() + t.getTime();
	}

	public void setRandomSource(RandomSource randomSource) {
		this.r = randomSource;

	}

	public void setTimeSource(TimeSource timeSource) {
		this.t = timeSource;
	}
}
