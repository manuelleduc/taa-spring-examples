package fr.mleduc.without;

public class Main {

	public static void main(final String[] args) {

		// Instanciation
		final MultiplyService multiplyService = new MultiplyService();
		final AddService addService = new AddService();

		// Execution
		System.out.println("Multi : " + multiplyService.multiply());
		System.out.println("Add   : " + addService.add());
	}

}
