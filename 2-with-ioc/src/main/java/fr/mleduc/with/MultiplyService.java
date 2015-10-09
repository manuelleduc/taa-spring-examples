package fr.mleduc.with;

public class MultiplyService {

	private RandomSource r;
	private TimeSource t;

	public long multiply() {
		return r.getRandom() * t.getTime();
	}

	public void setRandomSource(RandomSource randomSource) {
		this.r = randomSource;

	}

	public void setTimeSource(TimeSource timeSource) {
		this.t = timeSource;

	}
}
