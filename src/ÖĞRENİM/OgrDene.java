package ��REN�M;

public class OgrDene {

	public static void main(String[] args) {
		Bil o1 = new MatOgr("Yasin",19);
		Bil o2 = new FenOgr("Mehmet",20);
		Ciz o3 = new PsiOgr("Kaan",21);
		//o1,o2 ve o3 Ogr objesidir
		
		((Ogr) o1).adSoyle();
		((Ogr) o2).adSoyle();
		((Ogr) o3).adSoyle();
		
		//MatOgr class�na ait bir obje oldu�unu belirttik.Yani o1 nin Mat ��rencisi oldu�unu belirttik.
		o1.bilgisayardaYaz();
		
		//FenOgr class�na ait bir obje oldu�unu belirttik. Yani o2 nin Fen ��rencisi oldu�unu belirttik. 
		o2.bilgisayardaYaz();
		
		((Ciz) o2).ciz();
		o3.ciz();
		
		
		
		
	}
	
	

}






/*
//o2 ��rencisi bir fen ��rencisidir dedik.
((FenOgr) o2).bil();
//o1 ��rencisi bir matematik ��rencisidir dedik.
((MatOgr) o1).hesapla();
//Bu �ekilde yapmay�p MatOgr o1 = new MatOgr("Yasin",19); gibi objeyi olu�turup direkt �a��rabilirdik ama 
//hiyerar�inin sa�layaca�� faydalardan mahrum kal�rd�k.

o1.bolumSoyle();
o2.bolumSoyle();
o3.bolumSoyle();*/