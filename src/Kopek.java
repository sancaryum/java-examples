
public class Kopek extends Hayvan {
	
	int uykuSuresi,hiz;
	
	public Kopek(String isim,int yas, String mamaTuru, int uykuSuresi, int hiz) //K�pek yan�n� olu�turduk
	{
		super(isim, yas,mamaTuru); 			  //Hayvan yan�n� olu�turduk	
		this.uykuSuresi=uykuSuresi;
		this.hiz=hiz;
	}
	
	@Override
	public void sesCikar()
	{
		super.sesCikar();
		System.out.println(mamaTuru + " yerim");
		System.out.println();
	}
	

}
