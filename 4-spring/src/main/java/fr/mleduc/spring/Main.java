package fr.mleduc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// Instanciation
		final ApplicationContext ac = new ClassPathXmlApplicationContext("spring-main.xml");
		final MultiplyService multiplyService = ac.getBean(MultiplyService.class);
		final AddService addService = ac.getBean(AddService.class);

		// Execution
		System.out.println("Multi : " + multiplyService.multiply());
		System.out.println("Add   : " + addService.add());
	}

}
