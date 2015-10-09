package fr.mleduc.spring;

public class TimeSource implements ITimeSource {
	
	@Override
	public long getTime() {
		return System.currentTimeMillis();
	}
}
