
public class Kedi extends Hayvan {
	
	

	public Kedi(String isim, int yas, String mamaTuru)  //kedi yan�n� olu�turduk
	{
		super(isim,yas,mamaTuru); 						//hayvan yan�n� olu�turduk
	}
	
	public int islemYap(int sayi1, int sayi2)
	{
		//ilk olarak super metodundan gelen sonucu g�sterir, sonda sonuca say�lar� ekleyerek override edilen metodun sonucunu yazd�r�r. 
		int sonuc = super.islemYap(sayi1, sayi2);
		System.out.println(sonuc);
		return sonuc + sayi1 + sayi2;
	}
	
	

	@Override
	public void sesCikar() {
		super.sesCikar();
		System.out.print(mamaTuru + " i�erim");
		System.out.println();
		//sesCikar metodunu kedi i�in ba�tan tan�mlamak istiyorsak super metodu kald�r�l�r. Hayvan class'�n�n i�indeki sesCikar metodunun �st�ne 
		//in�a edilecekse super metodu kald�r�lmaz.
		
		
	}

	public void kediyeOzel()
	{
		System.out.println("Kediye �zel");
	}
	
	

}
