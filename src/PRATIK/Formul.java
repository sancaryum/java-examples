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
		System.out.println("-TER�M TOPLAMA PROGRAMI-");
		System.out.print("�lk terimi giriniz: ");
		a = scan.nextDouble();
		System.out.print("Son terimi giriniz: ");
		b = scan.nextDouble();
		System.out.print("Art�� miktar�n� giriniz: ");
		c = scan.nextDouble();
		System.out.println("Sonu� : " + islemsonucu() );
	}
	
	//Yukar�dakini mainde Formul.formulumuz2(); �eklinde �a��r.
	
	

	

}

/*public static void formulumuz()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("1.Say�y� giriniz: ");
	int a=scan.nextInt();
	System.out.println("2.Say�y� giriniz: ");
	int b=scan.nextInt();
	int [] dizi = new int[b-a+1];
	dizi[0]=a;
	dizi[b-a]=b;
	int i = 0;
	
	int sonuc = 0;
	
	do
	{
		//Elemanlar�n say� de�erini tan�mlatt�k
		dizi[i]=a+i;
		//Tan�mlanan de�erleri toplad�k
		sonuc=sonuc + dizi[i];
		i++;
		
	}while(i<b);

	System.out.println("Sonu�: " + sonuc);

}*/
