package Ders52;
public class Soru {
	
	String soruMetni;
	String secenekA,secenekB,secenekC,secenekD;
	public enum Cevap {CEVAP_A,CEVAP_B,CEVAP_C,CEVAP_D};
	Cevap dogruCevap;
	
	//Soru olu�turma constructor'�
	public Soru(String soruMetni, String secenekA, String secenekB, String secenekC, String secenekD, Cevap dogruCevap) {
		super();
		this.soruMetni = soruMetni;
		this.secenekA = secenekA;
		this.secenekB = secenekB;
		this.secenekC = secenekC;
		this.secenekD = secenekD;
		this.dogruCevap = dogruCevap;
	}
	
	boolean cevapKontrol(Cevap gelenCevap)
	{
		//gelenCevap dogruCevap'a e�itse cevapKontrol boolean� true olur. 
		return this.dogruCevap==gelenCevap;
	}
	
//	public static void main(String[] args) {
//		Soru soru1 = new Soru("T�rkiyenin ba�kenti neresidir?","Ankara","Bal�kesir","�stanbul","�zmir",Cevap.CEVAP_A);
//		System.out.println(soru1.soruMetni);
//		System.out.println(soru1.secenekA);
//		System.out.println(soru1.secenekB);
//		System.out.println(soru1.secenekC);
//		System.out.println(soru1.secenekD);
//		
//		//cevapKontrol'�n i�erisine enum type'�ndaki Cevap class�ndan de�i�ken getirdik.E�er getirdi�imiz de�i�ken, yani yan�t�m�z soru objesinin 
//		//dogruCevap de�i�kenine e�itse cevapKontrol boolean� true de�erini al�r.
//		System.out.println(soru1.cevapKontrol(Cevap.CEVAP_B));
//		System.out.println(soru1.cevapKontrol(Cevap.CEVAP_A));
//			}



}
	


