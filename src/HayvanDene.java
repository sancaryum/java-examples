
public class HayvanDene {
	public static void main(String[] args)
	{

		Kedi k1 = new Kedi("Sarman",10,"s�t");
		Kedi k2 = new Kedi("Sarman",10,"su");
		Kopek t = new Kopek("Karaba�",6,"kemik",8,10);
		Hayvan h1 = new Hayvan("Hayvan�m�z", 5, "Hayvan�m�z�n mamas�");
		
		System.out.println("��lem sonucu: "  + k1.islemYap(2, 4));
		System.out.println("��lem sonucu: "  + k2.islemYap(2, 4));
		System.out.println("��lem sonucu: "  + t.islemYap(2, 4));
		System.out.println("��lem sonucu: "  + h1.islemYap(2, 4));
		
		
		
		
		
	}

}
