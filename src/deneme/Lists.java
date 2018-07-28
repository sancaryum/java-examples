/*package deneme;

import java.util.Scanner;

public class Lists {

	Scanner scan = new Scanner(System.in);
	
	int elemanSayisi;
	int sinir;
	String[] liste; 
	
	//CONSTRUCTOR

	public Lists(int elemanKapasitesi)
	{
		liste = new String [elemanKapasitesi];
		elemanSayisi=0;
		sinir=elemanKapasitesi;
	}

	
	
	//METODLAR
	
	//Listeye eleman ekleme metodu
	public void elemanEkle(String eklenecekOlan)
	{
		if(elemanSayisi<sinir)
		{
			liste[elemanSayisi]=eklenecekOlan;
			elemanSayisi++;
		}
		
		else
		{
			System.out.println("Liste doldu!");
		}
		
	}
	
	//Listeyi yazd�rma metodu
	public void yaz()
	{
		for (int i=0; i<elemanSayisi;i++)
		{
			System.out.println(liste[i]);
		}
	}
	
	//index=0 verseydik ba�tan silme i�lemi yapacakt�.
	public void sil(int index)
	{
		for(int i = index ; i<elemanSayisi-1; i++)
		{
			liste[i]=liste[i+1];
		}
		//for'un i�indeki kayd�rma i�lemleri bittikten sonra sondaki de�eri bo� kalan indeksi sildik.
		
		elemanSayisi--;
			
		}
		
	public void ekle(String eklenecekEleman,int index)
	{
		for(int i=elemanSayisi-1 ;i>=index ;i--)
		{
			liste[i+1]=liste[i];
		}
		liste[index]=eklenecekEleman;
		elemanSayisi++;
	}
	
	
	//Alfabetik olarak en sonraki stringi bulur.
	public String max()
	{
		String enBuyuk=liste[0];
		
		for(int i = 0; i<elemanSayisi;i++)
		{
			if(liste[i].compareToIgnoreCase(enBuyuk)>0)
			{
				enBuyuk=liste[i];
			}
		}
		return enBuyuk;
	}
	
	//Alfabetik olarak en ba�taki stringi bulur.
	public String min()
	{
		String enKucuk=liste[0];
		
		for(int i = 0; i<elemanSayisi;i++)
		{
			if(liste[i].compareToIgnoreCase(enKucuk)<0)
			{
				enKucuk=liste[i];
			}
		}
		return enKucuk;
	}
	
	//Yer de�i�tirme metodu
	public void swap(int i1, int i2)
	{
		String tmp = liste[i1];
		liste[i1]=liste[i2];
		liste[i2]=tmp;
		
		
	
	}

	
//	public void sondanSil()
//	{
//		if (elemanSayisi>0)
//		{
//		elemanSayisi--;
//		liste[elemanSayisi]="";
//		}
//		
//		else 
//		{
//			System.out.println("Liste bo�!");
//		}
//	}
//	
//	public void bastanSil()
//	{
//		//Dizinin elemanlar�n� kayd�rma yapaca��m�z i�in for d�ng�s� kulland�k.
//		//elemanSayisinin 1 eksi�i kadar kayd�rma yapmak i�in for d�ng�s�n�n i�leminde elemanSayisinin de�erini 1 azaltt�k.
//		for(int i=0; i<elemanSayisi-1;i++)
//		{
//			liste[i]=liste[i+1];
//			
//		}
//		elemanSayisi--;
//	}
	
	
	
	
	
		
	
		
		
		
		
	}

*/
