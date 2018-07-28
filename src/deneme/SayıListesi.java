package deneme;

public class Say�Listesi {
	
	int elemanSayisi;
	int sinir;
	int[] liste; 
	
	//CONSTRUCTOR

	public Say�Listesi(int elemanKapasitesi)
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
	
	//Listeyi yazd�rma metodu
	public void yaz()
	{
		for(int i = 0;i<elemanSayisi;i++)
		{
			System.out.print(liste[i]+" ");
		}
	}
	
	//index=0 verseydik ba�tan silme i�lemi yapacakt�.
	public void sil(int index)
	{
		for(int i =index; i<elemanSayisi;i++)
		{
			//sildi�imiz yerden itibaren kayd�rma i�lemi yapt�.
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
	
	
	
	
	//En b�y�k int i bulur
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
	
	//En k���k int i bulur
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
	
	//Yer de�i�tirme metodu
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
	
	
//En ba�tan ba�layarak tek tek b�y�kl�k kar��la�t�r�p k���k olanla b�y�k olan�n yerini de�i�tiriyoruz.
//B�ylelikle yer de�i�tirme d�ng�s� sonunda say�lar k���kten b�y��e s�ralanm�� oldu. 	
//Her swap i�leminden sonra k'yi bir art�rarak ka� kere yer de�i�tirme i�lemi yap�ld���n� tutuyoruz.
	public void bubbleSort()
	{
		 boolean swapped = true;
		 int k=0;
		 
		 while(swapped)
		 {
			 swapped=false;
			 for(int i = 1 ; i<elemanSayisi;i++)
			 {
// s�ralama i�lemini tamamlad���nda do�al olarak if ko�ulu sa�lanmaz ve dolay�s�yla swapped true de�erini alamaz, while d�ng�s� son bulur.
				 if(liste[i-1]>liste[i]) 
				 {
					 
					 swap(i-1,i);
					 swapped=true;
					 k++;
//for'un i�indeki her d�zeltme i�leminden sonra ba�a d�nmeden bi neyi d�zeltti�ini g�rmek i�in listeyi yazd�ral�m.	
					 System.out.println();
					 yaz();
				 }
			 }
		 
		 }
		 System.out.println();
		 System.out.println("Bubble K: " + k);
		 
	}
	
		
	
}
		
		
	

	


