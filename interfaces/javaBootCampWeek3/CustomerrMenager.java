package javaBootCampWeek3;

public class CustomerrMenager {

	private CustomerDao customerDao;
	
	public CustomerrMenager(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	
	public void add1() {
		
		customerDao.add();
	}
}
