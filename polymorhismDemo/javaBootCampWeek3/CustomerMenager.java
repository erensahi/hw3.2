package javaBootCampWeek3;

public class CustomerMenager {

	private Logger logger;
	
	public CustomerMenager(Logger logger) {
		this.logger=logger;
	}
		
	public void add() {
		System.out.println("Müşteri eklendi: ");
	    logger.log("log mesajı");
	}
}
