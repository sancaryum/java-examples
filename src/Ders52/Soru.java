package Ders52;
public class Soru {
	
	String soruMetni;
	String secenekA,secenekB,secenekC,secenekD;
	public enum Cevap {CEVAP_A,CEVAP_B,CEVAP_C,CEVAP_D};
	Cevap dogruCevap;
	
	//Soru oluþturma constructor'ý
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
		//gelenCevap dogruCevap'a eþitse cevapKontrol booleaný true olur. 
		return this.dogruCevap==gelenCevap;
	}
	
//	public static void main(String[] args) {
//		Soru soru1 = new Soru("Türkiyenin baþkenti neresidir?","Ankara","Balýkesir","Ýstanbul","Ýzmir",Cevap.CEVAP_A);
//		System.out.println(soru1.soruMetni);
//		System.out.println(soru1.secenekA);
//		System.out.println(soru1.secenekB);
//		System.out.println(soru1.secenekC);
//		System.out.println(soru1.secenekD);
//		
//		//cevapKontrol'ün içerisine enum type'ýndaki Cevap classýndan deðiþken getirdik.Eðer getirdiðimiz deðiþken, yani yanýtýmýz soru objesinin 
//		//dogruCevap deðiþkenine eþitse cevapKontrol booleaný true deðerini alýr.
//		System.out.println(soru1.cevapKontrol(Cevap.CEVAP_B));
//		System.out.println(soru1.cevapKontrol(Cevap.CEVAP_A));
//			}



}
	


