package ÖÐRENÝM;

public class FenOgr extends Ogr implements Bil,Ciz {

	public FenOgr(String isim, int no) {
		super(isim, no);
	}
	
	public void bil()
	{
		System.out.println("Bildim");
	}

	@Override
	public void bolumSoyle() {
		System.out.println("Benim bölümüm Fen");
		
	}

	@Override
	public void bilgisayardaYaz() {
		System.out.println("Tamam aga yazdým :d bende fenciyim :d");
		
	}

	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void ciz() {
		// TODO Auto-generated method stub
		System.out.println("Ýskelet sistemi çizdim ehe :D");
	}

	

	

}
