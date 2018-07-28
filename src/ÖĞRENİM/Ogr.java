package ÖÐRENÝM;

public abstract class Ogr {

	private String isim;
	private int no;
	
	public Ogr(String isim, int no) 
	{
		this.isim = isim;
		this.no = no;
	}
	
	public void adSoyle()
	{
		System.out.println("Benim adým " + isim);
	}
	
	//Alt classlardaki MatOgr ve FenOgr nin bazý metodlarý bulundurmasý þartýný abstract metod ekleyerek saðlamýþ olduk.
	public abstract void bolumSoyle();
	
	
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
