package PRATIK;

import java.util.Scanner;

public class Formul {
	
	Scanner scan = new Scanner(System.in);
	static double a,b,c,sonuc;
	
	public Formul()
	{
		
	}
	
	public static double islemsonucu()
	{
		return ((a+b)*(b-a+c))/2*c;
	}
	
	public static void formulumuz2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("-TERÝM TOPLAMA PROGRAMI-");
		System.out.print("Ýlk terimi giriniz: ");
		a = scan.nextDouble();
		System.out.print("Son terimi giriniz: ");
		b = scan.nextDouble();
		System.out.print("Artýþ miktarýný giriniz: ");
		c = scan.nextDouble();
		System.out.println("Sonuç : " + islemsonucu() );
	}
	
	//Yukarýdakini mainde Formul.formulumuz2(); þeklinde çaðýr.
	
	

	

}

/*public static void formulumuz()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("1.Sayýyý giriniz: ");
	int a=scan.nextInt();
	System.out.println("2.Sayýyý giriniz: ");
	int b=scan.nextInt();
	int [] dizi = new int[b-a+1];
	dizi[0]=a;
	dizi[b-a]=b;
	int i = 0;
	
	int sonuc = 0;
	
	do
	{
		//Elemanlarýn sayý deðerini tanýmlattýk
		dizi[i]=a+i;
		//Tanýmlanan deðerleri topladýk
		sonuc=sonuc + dizi[i];
		i++;
		
	}while(i<b);

	System.out.println("Sonuç: " + sonuc);

}*/
