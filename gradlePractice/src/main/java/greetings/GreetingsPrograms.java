package greetings;

import org.joda.time.LocalTime;

public class GreetingsPrograms {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		Greeter greeter = new Greeter();

		System.out.println(greeter.sayHello());
		System.out.println("The current local time is: " + currentTime);
	}
}
