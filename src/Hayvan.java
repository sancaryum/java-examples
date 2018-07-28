
public class Hayvan {
	
	int yas;
	String isim,mamaTuru;
	
	public Hayvan(String isim, int yas, String mamaTuru)
	{
		this.isim=isim;
		this.yas= yas;
		this.mamaTuru=mamaTuru;
	}
	
	public int islemYap(int a,int b)
	{
		System.out.println(a +  "*"  + (b+3));
		return a*(b+3);
	}
	
	public void yuru()
	{
		System.out.println("Yürüdüm");
	}
	
	public void yasSoyle()
	{
		System.out.println("Yaþým: " + yas);
	}
	
	public void sesCikar()
	{
		System.out.print("Benim adým " + isim + ", " +  yas + " yaþýndayým ve ");
		
		
	}

}
