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
	//cemberMevcut çemberdeki eleman sayýsýný gösterir. 
	int cemberMevcut=0;
	int cemberMax=1000;
	
	
	
	int artisMiktari = 2;
	
	
	public KarePencere()
	{
		super();
		//this diyerek bu JPanele mouse listener eklemiþ olduk.Ekleyecek olduðumuz MouseListener bu classýn kendisi olduðu için this dedik.
		addMouseListener(this);
		
		cemberler = new Cember[cemberMax];
		
		
		//this = yenilediðin yer. Deðerleri yenilediðimiz için deðerlerin olduðu sütunu göstermek için this yazdýk.
		Timer zaman = new Timer(40,this);
		zaman.start();
		
	}
	
	
	/* ---1---paintComponent metodundan baþlayarak ,for döngüsü her dönüþünde bir ekranCiz metodu çaðýrýr. ekranCiz metodunun yaptýðý þey 
	týkladýðýn koordinatlarý referans alarak g objesiyle bir þekil (çember) çizer.  */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0 ; i< cemberMevcut ; i++)
		{
			cemberler[i].ekranCiz(g);
		}
	}


	/*---2---actionPerformed tetiklenince buraya gelir, x milisaniyede bir genisle metoduyla tüm çemberlerin genisliðinin artmasý ve merkezinin oynamamasý saðlanýr
	ayrýca paneli yeniler   */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i< cemberMevcut ; i++)
		{
			cemberler[i].genisle(artisMiktari);
		}
		repaint();
		
		
	}

	/*---3---Mouse'a týklayýp býraktýðýmýzda mevcut çember sayýsý maximumuma ulaþmamýþ ise týkladýðýmýz yerin x ve y koordinatlarý ile yeni 
	  bir çember objesi oluþturuyoruz, sonra bu objeyi bulunduðu sýradaki cemberler obje dizisine tanýtýyoruz. Ve yeni bir çember objesi oluþturarak
	  diziye yeni bir üye kattýðýmýz için olasý diðer týklamada eklenecek çember objesinin sýradaki indexe eklenmesi için cemberMevcut sayýsýný, 
	  yani indexi 1 artýrdýk.    */

	@Override
	public void mousePressed(MouseEvent e) {
		//Geniþliði de sýfýrdan baþlayacaðý için 0 yazdýk.
		//cemberMevcut'un cemberMax'ý aþmasýný engellemek için if yapýsý ekleriz.
		
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
