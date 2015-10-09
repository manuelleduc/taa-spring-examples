package fr.mleduc.spring;

public class MultiplyService {

	private IRandomSource r;
	private ITimeSource t;

	public long multiply() {
		return r.getRandom() * t.getTime();
	}

	public void setRandomSource(IRandomSource randomSource) {
		this.r = randomSource;

	}

	public void setTimeSource(ITimeSource timeSource) {
		this.t = timeSource;

	}
}
