package javaBootCampWeek3;

public class InterfaceMain {

	public static void main(String[] args) {
		
	//	CustomerDao customerDao=new OracleCustomerDao();
	/*
	 * CustomerrMenager customerMenager=new CustomerrMenager();
	 * customerMenager.customerDao=new OracleCustomerDao(); customerMenager.add1();
	 * 
	 * CustomerrMenager customerMenager1=new CustomerrMenager();
	 * customerMenager1.customerDao=new SqlCustomerDao(); customerMenager1.add1();
	 */
		
		CustomerrMenager customerMenager=new CustomerrMenager(new SqlCustomerDao());
		customerMenager.add1();
		
	}

}
