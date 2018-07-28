
public class Kopek extends Hayvan {
	
	int uykuSuresi,hiz;
	
	public Kopek(String isim,int yas, String mamaTuru, int uykuSuresi, int hiz) //Köpek yanýný oluþturduk
	{
		super(isim, yas,mamaTuru); 			  //Hayvan yanýný oluþturduk	
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
