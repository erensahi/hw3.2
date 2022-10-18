package javaBootCampWeek3;

public class AbstractDemoMain {

	public static void main(String[] args) {
		
		CustomerMenagerr customerMenager=new CustomerMenagerr();
		CustomerMenagerr customerMenager1=new CustomerMenagerr();
		CustomerMenagerr customerMenager2=new CustomerMenagerr();
	
       customerMenager.databaseMenager=new OracleDatabaseMenager();
       customerMenager.getCustomers();
       
       customerMenager1.databaseMenager=new SqlServerDatabaseMenager();
       customerMenager1.getCustomers();
       
       customerMenager2.databaseMenager=new MySqlDatabaseMenager();
       customerMenager2.getCustomers();
       
       
       
	}

}
