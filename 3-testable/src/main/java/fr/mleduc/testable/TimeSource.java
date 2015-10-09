package fr.mleduc.testable;

public class TimeSource implements ITimeSource {
	
	@Override
	public long getTime() {
		return System.currentTimeMillis();
	}
}
