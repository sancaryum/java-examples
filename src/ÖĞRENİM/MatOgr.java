package ÖÐRENÝM;

public class MatOgr extends Ogr implements Bil {

	public MatOgr(String isim, int no) {
		super(isim, no);
	}

	public void hesapla()
	{
		System.out.println("Hesapladým");
	}

	@Override
	public void bolumSoyle() {
		System.out.println("Benim bölümüm Mat");
		
	}

	@Override
	public void bilgisayardaYaz() {
		System.out.println("Yazdým ben matcýyým :d");
		
	}

	@Override
	public int bilgi(int a, int b) {
		return a*b + b*2 ;
	}
}
