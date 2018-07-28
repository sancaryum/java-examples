package ÖÐRENÝM;

public class OgrDene {

	public static void main(String[] args) {
		Bil o1 = new MatOgr("Yasin",19);
		Bil o2 = new FenOgr("Mehmet",20);
		Ciz o3 = new PsiOgr("Kaan",21);
		//o1,o2 ve o3 Ogr objesidir
		
		((Ogr) o1).adSoyle();
		((Ogr) o2).adSoyle();
		((Ogr) o3).adSoyle();
		
		//MatOgr classýna ait bir obje olduðunu belirttik.Yani o1 nin Mat öðrencisi olduðunu belirttik.
		o1.bilgisayardaYaz();
		
		//FenOgr classýna ait bir obje olduðunu belirttik. Yani o2 nin Fen öðrencisi olduðunu belirttik. 
		o2.bilgisayardaYaz();
		
		((Ciz) o2).ciz();
		o3.ciz();
		
		
		
		
	}
	
	

}






/*
//o2 öðrencisi bir fen öðrencisidir dedik.
((FenOgr) o2).bil();
//o1 öðrencisi bir matematik öðrencisidir dedik.
((MatOgr) o1).hesapla();
//Bu þekilde yapmayýp MatOgr o1 = new MatOgr("Yasin",19); gibi objeyi oluþturup direkt çaðýrabilirdik ama 
//hiyerarþinin saðlayacaðý faydalardan mahrum kalýrdýk.

o1.bolumSoyle();
o2.bolumSoyle();
o3.bolumSoyle();*/