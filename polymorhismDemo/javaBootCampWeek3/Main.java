package javaBootCampWeek3;

public class Main {

	public static void main(String[] args) {
	//	EmailLogger emailLogger=new EmailLogger();
	//	emailLogger.log("log mesajı");

	/*	Logger [] logger =new Logger []{new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
		for (Logger logtypes:logger) {
			logtypes.log("log mesajı");*/
		
		CustomerMenager customerMenager=new CustomerMenager(new EmailLogger());
		customerMenager.add();
		}
	}


