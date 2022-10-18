package javaBootCampWeek3;

public class StaticDemoMain {

	public static void main(String[] args) {
		ProductMenager productMenager=new ProductMenager();
		Productt product=new Productt();
		
        product.name="Mouse";
        product.price=10.0;
        
        productMenager.add(product);
	}

}
