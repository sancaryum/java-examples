
public class HayvanDene {
	public static void main(String[] args)
	{

		Kedi k1 = new Kedi("Sarman",10,"süt");
		Kedi k2 = new Kedi("Sarman",10,"su");
		Kopek t = new Kopek("Karabaþ",6,"kemik",8,10);
		Hayvan h1 = new Hayvan("Hayvanýmýz", 5, "Hayvanýmýzýn mamasý");
		
		System.out.println("Ýþlem sonucu: "  + k1.islemYap(2, 4));
		System.out.println("Ýþlem sonucu: "  + k2.islemYap(2, 4));
		System.out.println("Ýþlem sonucu: "  + t.islemYap(2, 4));
		System.out.println("Ýþlem sonucu: "  + h1.islemYap(2, 4));
		
		
		
		
		
	}

}
