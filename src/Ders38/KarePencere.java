package Ders38;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencere extends JPanel implements ActionListener,MouseListener {
	
	Cember[] cemberler;
	//cemberMevcut �emberdeki eleman say�s�n� g�sterir. 
	int cemberMevcut=0;
	int cemberMax=1000;
	
	
	
	int artisMiktari = 2;
	
	
	public KarePencere()
	{
		super();
		//this diyerek bu JPanele mouse listener eklemi� olduk.Ekleyecek oldu�umuz MouseListener bu class�n kendisi oldu�u i�in this dedik.
		addMouseListener(this);
		
		cemberler = new Cember[cemberMax];
		
		
		//this = yeniledi�in yer. De�erleri yeniledi�imiz i�in de�erlerin oldu�u s�tunu g�stermek i�in this yazd�k.
		Timer zaman = new Timer(40,this);
		zaman.start();
		
	}
	
	
	/* ---1---paintComponent metodundan ba�layarak ,for d�ng�s� her d�n���nde bir ekranCiz metodu �a��r�r. ekranCiz metodunun yapt��� �ey 
	t�klad���n koordinatlar� referans alarak g objesiyle bir �ekil (�ember) �izer.  */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0 ; i< cemberMevcut ; i++)
		{
			cemberler[i].ekranCiz(g);
		}
	}


	/*---2---actionPerformed tetiklenince buraya gelir, x milisaniyede bir genisle metoduyla t�m �emberlerin genisli�inin artmas� ve merkezinin oynamamas� sa�lan�r
	ayr�ca paneli yeniler   */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i< cemberMevcut ; i++)
		{
			cemberler[i].genisle(artisMiktari);
		}
		repaint();
		
		
	}

	/*---3---Mouse'a t�klay�p b�rakt���m�zda mevcut �ember say�s� maximumuma ula�mam�� ise t�klad���m�z yerin x ve y koordinatlar� ile yeni 
	  bir �ember objesi olu�turuyoruz, sonra bu objeyi bulundu�u s�radaki cemberler obje dizisine tan�t�yoruz. Ve yeni bir �ember objesi olu�turarak
	  diziye yeni bir �ye katt���m�z i�in olas� di�er t�klamada eklenecek �ember objesinin s�radaki indexe eklenmesi i�in cemberMevcut say�s�n�, 
	  yani indexi 1 art�rd�k.    */

	@Override
	public void mousePressed(MouseEvent e) {
		//Geni�li�i de s�f�rdan ba�layaca�� i�in 0 yazd�k.
		//cemberMevcut'un cemberMax'� a�mas�n� engellemek i�in if yap�s� ekleriz.
		
			if(cemberMevcut<cemberMax)
			{
			Cember yenicember = new Cember(e.getX(),e.getY(),0);
			cemberler[cemberMevcut] = yenicember;
			cemberMevcut++;
			}
			
		
		
		
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
