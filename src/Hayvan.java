
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
		System.out.println("Y�r�d�m");
	}
	
	public void yasSoyle()
	{
		System.out.println("Ya��m: " + yas);
	}
	
	public void sesCikar()
	{
		System.out.print("Benim ad�m " + isim + ", " +  yas + " ya��nday�m ve ");
		
		
	}

}
