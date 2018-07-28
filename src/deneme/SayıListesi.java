package deneme;

public class SayýListesi {
	
	int elemanSayisi;
	int sinir;
	int[] liste; 
	
	//CONSTRUCTOR

	public SayýListesi(int elemanKapasitesi)
	{
		liste = new int[elemanKapasitesi];
		sinir=elemanKapasitesi;
		elemanSayisi=0;		
	}

	
	
	//METODLAR
	
	//Listeye eleman ekleme metodu
	public void elemanEkle(int eklenecekOlan)
	{
		if(elemanSayisi<sinir)
		{
			liste[elemanSayisi]=eklenecekOlan;
			elemanSayisi++;
		}
		
		else
		{
			System.out.println("Liste dolu!");
		}
		
	}
	
	//Listeyi yazdýrma metodu
	public void yaz()
	{
		for(int i = 0;i<elemanSayisi;i++)
		{
			System.out.print(liste[i]+" ");
		}
	}
	
	//index=0 verseydik baþtan silme iþlemi yapacaktý.
	public void sil(int index)
	{
		for(int i =index; i<elemanSayisi;i++)
		{
			//sildiðimiz yerden itibaren kaydýrma iþlemi yaptý.
			liste[i]=liste[i+1];
		}
		elemanSayisi--;
			
	}
		
	public void ekle(int eklenecekEleman,int index)
	{
		for(int i=elemanSayisi-1; i>=index; i--)
		{
			liste[i+1]=liste[i];
		}
		liste[index]=eklenecekEleman;
		elemanSayisi++;
		
	}
	
	
	
	
	//En büyük int i bulur
	public int max()
	{
		int enBuyuk=liste[0];
		
		for(int i = 0; i<elemanSayisi;i++)
		{
			if(liste[i]>enBuyuk)
			{
				enBuyuk=liste[i];
			}
		}
		return enBuyuk;
	}
	
	//En küçük int i bulur
	public int min()
	{
		int enKucuk=liste[0];
		for(int i =0 ; i<elemanSayisi;i++)
		{
			if(liste[i]<enKucuk)
			{
				enKucuk=liste[i];
			}
		}
		return enKucuk;
		
		
	}
	
	//Yer deðiþtirme metodu
	public void swap(int i1, int i2)
	{
		int tmp = liste[i1];
		liste[i1]=liste[i2];
		liste[i2]=tmp;
	}
	
	public void selectionSort()
	{
		int enKucukIndex;
		int k=0;
		
		for(int i = 0; i<elemanSayisi;i++)
		{
			enKucukIndex=i;
			for(int j =i ; j<elemanSayisi;j++)
			{
				if(liste[j]<liste[enKucukIndex])
				{
					enKucukIndex=j;
					System.out.println();
					yaz();
				}
			}
			
		swap(enKucukIndex,i);	
		k++;
		
		}
		System.out.println();
		System.out.println("Selection K:" + k);
		
			
		
	}

	public void selectionSortTers()
	{
		int enBuyukIndex;
		int k=0;
		
		for(int i = 0; i<elemanSayisi;i++)
		{
			enBuyukIndex=i;
			for(int j =i ; j<elemanSayisi;j++)
			{
				if(liste[j]>liste[enBuyukIndex])
				{
					enBuyukIndex=j;
				}
			}
			
		swap(enBuyukIndex,i);
		
		}
		
	}
	
	
//En baþtan baþlayarak tek tek büyüklük karþýlaþtýrýp küçük olanla büyük olanýn yerini deðiþtiriyoruz.
//Böylelikle yer deðiþtirme döngüsü sonunda sayýlar küçükten büyüðe sýralanmýþ oldu. 	
//Her swap iþleminden sonra k'yi bir artýrarak kaç kere yer deðiþtirme iþlemi yapýldýðýný tutuyoruz.
	public void bubbleSort()
	{
		 boolean swapped = true;
		 int k=0;
		 
		 while(swapped)
		 {
			 swapped=false;
			 for(int i = 1 ; i<elemanSayisi;i++)
			 {
// sýralama iþlemini tamamladýðýnda doðal olarak if koþulu saðlanmaz ve dolayýsýyla swapped true deðerini alamaz, while döngüsü son bulur.
				 if(liste[i-1]>liste[i]) 
				 {
					 
					 swap(i-1,i);
					 swapped=true;
					 k++;
//for'un içindeki her düzeltme iþleminden sonra baþa dönmeden bi neyi düzelttiðini görmek için listeyi yazdýralým.	
					 System.out.println();
					 yaz();
				 }
			 }
		 
		 }
		 System.out.println();
		 System.out.println("Bubble K: " + k);
		 
	}
	
		
	
}
		
		
	

	


