package fr.mleduc.testable;

public class Main {

	public static void main(String[] args) {
		
		// Instanciation
		final IRandomSource randomSource = new RandomSource();
		final ITimeSource timeSource = new TimeSource();
		
		final MultiplyService multiplyService = new MultiplyService();
		final AddService addService = new AddService();
		
		// IoC
		multiplyService.setRandomSource(randomSource);
		multiplyService.setTimeSource(timeSource);
		
		addService.setRandomSource(randomSource);
		addService.setTimeSource(timeSource);
		
		
		// Execution
		System.out.println("Multi : " + multiplyService.multiply());
		System.out.println("Add   : " + addService.add());
	}

}
