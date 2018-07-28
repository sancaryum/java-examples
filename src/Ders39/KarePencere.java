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
	//cemberMevcut çemberdeki eleman sayýsýný gösterir. 
	int cemberMevcut=0;
	int cemberMax=3;
	int cemberEleman=0;
	Timer zaman;
	
	
	int artisMiktari = 2;
	
	
	public KarePencere()
	{
		super();
		//this diyerek bu JPanele mouse listener eklemiþ olduk.Ekleyecek olduðumuz MouseListener bu classýn kendisi olduðu için this dedik.
		addMouseListener(this);
		addKeyListener(this);
		
		cemberler = new Cember[cemberMax];
		
		
		//this = yenilediðin yer. Deðerleri yenilediðimiz için deðerlerin olduðu sütunu göstermek için this yazdýk.
		zaman = new Timer(40,this);
		zaman.start();
		
	}
	
	
	/* ---1---paintComponent metodundan baþlayarak ,for döngüsü her dönüþünde bir ekranCiz metodu çaðýrýr. ekranCiz metodunun yaptýðý þey 
	týkladýðýn koordinatlarý referans alarak g objesiyle bir þekil (çember) çizer.  */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0 ; i< cemberEleman ; i++)
		{
			cemberler[i].ekranCiz(g);
		}
	}


	/*---2---actionPerformed tetiklenince buraya gelir, x milisaniyede bir genisle metoduyla tüm çemberlerin genisliðinin artmasý ve merkezinin oynamamasý saðlanýr
	ayrýca paneli yeniler   */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i< cemberEleman ; i++)
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
		//cemberEleman'ýn cemberMax'ý aþmasýný engellemek için if yapýsý ekleriz.
		
			
		Cember yeniCember = new Cember(e.getX(),e.getY(),0);
		cemberler[cemberMevcut] = yeniCember;
		//cemberMevcut sayýsý cemberMaxý geçince yeni eklenecek elemanlarýn baþtaki indexin yerine eklenmesi için modunu aldýk.
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
