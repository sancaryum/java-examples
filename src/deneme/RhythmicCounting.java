package deneme;

import java.util.Scanner;

public class RhythmicCounting {


public static void main(String [] args) {
Scanner scan = new Scanner(System.in);
boolean calisir = true;

while(calisir)
{
program();

System.out.println("Yeniden i�lem yapmak ister misiniz? (Evet/Hay�r)");
System.out.print("Cevap: ");
String islem = scan.nextLine();

if (islem.equalsIgnoreCase("Evet"))
{
	program();
}

else if (islem.equalsIgnoreCase("Hay�r"))
{	
	calisir=false;
}

}







}

public static void program()

{
	
Scanner scan = new Scanner(System.in);
System.out.println("Programa Ho�geldiniz! ");
System.out.println("1-Birer birer sayma");
System.out.println("2-�ki�er iki�er sayma");
System.out.println("3-��er ��er sayma");
System.out.println("4-��k��");
System.out.print("Yapmak istedi�iniz i�lemin numaras�n� giriniz: ");
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
		System.out.println("Programdan ��k�� yap�ld�!");
		calisir=false;
	}
	
	else 
	{
		System.out.println("Yanl�� De�er Girdiniz!");
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
	System.out.print("Ba�lang�� say�s�n� giriniz: ");
	int a = scan.nextInt();
	System.out.print("Son say�y� giriniz: ");
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
	System.out.print("Ba�lang�� say�s�n� giriniz: ");
	int a = scan.nextInt();
	System.out.print("Son say�y� giriniz: ");
	int b= scan.nextInt();
	while(a<=b)
	{
		System.out.println(a);
		a=a+2;
		break;
	}
	System.out.println("��lem Tamamland�!");
	
}

public static void ucerucer()
{
	Scanner scan = new Scanner (System.in);
	System.out.print("Ba�lang�� say�s�n� giriniz: ");
	int a = scan.nextInt();
	System.out.print("Son say�y� giriniz: ");
	int b= scan.nextInt();
	while(a<=b)
	{
		System.out.println(a);
		a=a+3;
	}
	System.out.println("��lem Tamamland�!");
}

}

