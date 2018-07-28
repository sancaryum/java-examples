package Ders39;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencere extends JPanel implements ActionListener,MouseListener, KeyListener {
	
	Cember[] cemberler;
	//cemberMevcut �emberdeki eleman say�s�n� g�sterir. 
	int cemberMevcut=0;
	int cemberMax=3;
	int cemberEleman=0;
	Timer zaman;
	
	
	int artisMiktari = 2;
	
	
	public KarePencere()
	{
		super();
		//this diyerek bu JPanele mouse listener eklemi� olduk.Ekleyecek oldu�umuz MouseListener bu class�n kendisi oldu�u i�in this dedik.
		addMouseListener(this);
		addKeyListener(this);
		
		cemberler = new Cember[cemberMax];
		
		
		//this = yeniledi�in yer. De�erleri yeniledi�imiz i�in de�erlerin oldu�u s�tunu g�stermek i�in this yazd�k.
		zaman = new Timer(40,this);
		zaman.start();
		
	}
	
	
	/* ---1---paintComponent metodundan ba�layarak ,for d�ng�s� her d�n���nde bir ekranCiz metodu �a��r�r. ekranCiz metodunun yapt��� �ey 
	t�klad���n koordinatlar� referans alarak g objesiyle bir �ekil (�ember) �izer.  */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0 ; i< cemberEleman ; i++)
		{
			cemberler[i].ekranCiz(g);
		}
	}


	/*---2---actionPerformed tetiklenince buraya gelir, x milisaniyede bir genisle metoduyla t�m �emberlerin genisli�inin artmas� ve merkezinin oynamamas� sa�lan�r
	ayr�ca paneli yeniler   */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i< cemberEleman ; i++)
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
		//cemberEleman'�n cemberMax'� a�mas�n� engellemek i�in if yap�s� ekleriz.
		
			
		Cember yeniCember = new Cember(e.getX(),e.getY(),0);
		cemberler[cemberMevcut] = yeniCember;
		//cemberMevcut say�s� cemberMax� ge�ince yeni eklenecek elemanlar�n ba�taki indexin yerine eklenmesi i�in modunu ald�k.
		cemberMevcut=(cemberMevcut+1)%cemberMax;
		
		if(cemberEleman<cemberMax)
		{	
		cemberEleman++;
		}
			
		
		
		
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		zaman.start();
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		zaman.stop();
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		
		if(e.getKeyCode()==e.VK_UP)
		{
			artisMiktari++;
		}
		
		else if(e.getKeyCode()==e.VK_DOWN)
		{
			artisMiktari--;
		}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	

}
