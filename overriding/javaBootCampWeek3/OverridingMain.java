package javaBootCampWeek3;

public class OverridingMain {

	public static void main(String[] args) {
		/*
		 * OgretmenKrediMenager ogretmen=new OgretmenKrediMenager();
		 * System.out.println(ogretmen.hesapla(1000));
		 */	

		BaseKrediMenager [] credits =new BaseKrediMenager []
				                    {new OgretmenKrediMenager(),new TarimKrediMenager(),new OgrenciKrediMenager()};
		
		for (BaseKrediMenager krediler:credits)
		{
			System.out.println(krediler.hesapla(1000));
		}
	} 

}
