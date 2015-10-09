package fr.mleduc.testable;

public class AddService {
	private IRandomSource r;
	private ITimeSource t;

	public long add() {
		return r.getRandom() + t.getTime();
	}

	public void setRandomSource(IRandomSource randomSource) {
		this.r = randomSource;

	}

	public void setTimeSource(ITimeSource timeSource) {
		this.t = timeSource;
	}
}
