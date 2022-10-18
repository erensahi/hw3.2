package javaBootCampWeek3;

public class ProductValidator {
	
	
	static {
		System.out.println("Statik yapıcı blok çalıştırıldı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}

	public static boolean isValid(Productt product) {
		
		if (product.price>0 && !product.name.isEmpty())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	  public void bisey() 
	  { 
	  System.out.println("Bişey yok"); 
	  }
	 
}

