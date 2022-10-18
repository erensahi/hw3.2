package javaBootCampWeek3;

public class ProductMenager {
	
	public void add(Productt product) {
	//	ProductValidator validator=new ProductValidator();
		if(ProductValidator.isValid(product)) 
		{
			System.out.println("Ürün eklendi.");
		}
		else {
			System.out.println("Ürün eklenemedi.Ürün bilgileri geçersiz...");
		}
		
		/*
		 * ProductValidator productValidator=new ProductValidator();
		 * productValidator.bisey();
		 */
		
		
	}
	

}
