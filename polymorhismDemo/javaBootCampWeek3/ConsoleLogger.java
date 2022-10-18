package javaBootCampWeek3;

public class ConsoleLogger extends Logger{

	public void log(String message) {
		System.out.println("logged to console: "+message);
	}
}
