package deneme;

import java.util.Scanner;

public class RhythmicCounting {


public static void main(String [] args) {
Scanner scan = new Scanner(System.in);
boolean calisir = true;

while(calisir)
{
program();

System.out.println("Yeniden iþlem yapmak ister misiniz? (Evet/Hayýr)");
System.out.print("Cevap: ");
String islem = scan.nextLine();

if (islem.equalsIgnoreCase("Evet"))
{
	program();
}

else if (islem.equalsIgnoreCase("Hayýr"))
{	
	calisir=false;
}

}







}

public static void program()

{
	
Scanner scan = new Scanner(System.in);
System.out.println("Programa Hoþgeldiniz! ");
System.out.println("1-Birer birer sayma");
System.out.println("2-Ýkiþer ikiþer sayma");
System.out.println("3-Üçer üçer sayma");
System.out.println("4-Çýkýþ");
System.out.print("Yapmak istediðiniz iþlemin numarasýný giriniz: ");
int x = scan.nextInt();
boolean calisir = true;



	
	if(x==1)
	{
		birerbirer();
		
	
	}
	
	else if(x==2)
	{
		ikiserikiser();
	}
	
	else if(x==3)
	{
		ucerucer();
	}
	
	else if(x==4)
	{
		System.out.println("Programdan çýkýþ yapýldý!");
		calisir=false;
	}
	
	else 
	{
		System.out.println("Yanlýþ Deðer Girdiniz!");
	}
	
	
	
	}
	


/***
 * METODLAR
 * 
 */
public static void birerbirer()
{
	boolean calisir = true;
	
	while(calisir)
	{
	
	Scanner scan = new Scanner (System.in);
	System.out.print("Baþlangýç sayýsýný giriniz: ");
	int a = scan.nextInt();
	System.out.print("Son sayýyý giriniz: ");
	int b= scan.nextInt();
	do
	{
		System.out.println(a);
		a=a+1;
	}while(a<=b);

    }
	
	
	
	

}

public static void ikiserikiser()
{
	Scanner scan = new Scanner (System.in);
	System.out.print("Baþlangýç sayýsýný giriniz: ");
	int a = scan.nextInt();
	System.out.print("Son sayýyý giriniz: ");
	int b= scan.nextInt();
	while(a<=b)
	{
		System.out.println(a);
		a=a+2;
		break;
	}
	System.out.println("Ýþlem Tamamlandý!");
	
}

public static void ucerucer()
{
	Scanner scan = new Scanner (System.in);
	System.out.print("Baþlangýç sayýsýný giriniz: ");
	int a = scan.nextInt();
	System.out.print("Son sayýyý giriniz: ");
	int b= scan.nextInt();
	while(a<=b)
	{
		System.out.println(a);
		a=a+3;
	}
	System.out.println("Ýþlem Tamamlandý!");
}

}

