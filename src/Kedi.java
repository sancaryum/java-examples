
public class Kedi extends Hayvan {
	
	

	public Kedi(String isim, int yas, String mamaTuru)  //kedi yanýný oluþturduk
	{
		super(isim,yas,mamaTuru); 						//hayvan yanýný oluþturduk
	}
	
	public int islemYap(int sayi1, int sayi2)
	{
		//ilk olarak super metodundan gelen sonucu gösterir, sonda sonuca sayýlarý ekleyerek override edilen metodun sonucunu yazdýrýr. 
		int sonuc = super.islemYap(sayi1, sayi2);
		System.out.println(sonuc);
		return sonuc + sayi1 + sayi2;
	}
	
	

	@Override
	public void sesCikar() {
		super.sesCikar();
		System.out.print(mamaTuru + " içerim");
		System.out.println();
		//sesCikar metodunu kedi için baþtan tanýmlamak istiyorsak super metodu kaldýrýlýr. Hayvan class'ýnýn içindeki sesCikar metodunun üstüne 
		//inþa edilecekse super metodu kaldýrýlmaz.
		
		
	}

	public void kediyeOzel()
	{
		System.out.println("Kediye özel");
	}
	
	

}
