package ��REN�M;

public class MatOgr extends Ogr implements Bil {

	public MatOgr(String isim, int no) {
		super(isim, no);
	}

	public void hesapla()
	{
		System.out.println("Hesaplad�m");
	}

	@Override
	public void bolumSoyle() {
		System.out.println("Benim b�l�m�m Mat");
		
	}

	@Override
	public void bilgisayardaYaz() {
		System.out.println("Yazd�m ben matc�y�m :d");
		
	}

	@Override
	public int bilgi(int a, int b) {
		return a*b + b*2 ;
	}
}
