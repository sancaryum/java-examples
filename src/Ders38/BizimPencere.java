package Ders38;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class BizimPencere extends JFrame implements MouseListener,KeyListener {
	
	private Random rnd;
	
	private int x,y;
	private String yazi;
	
	
	
	public BizimPencere()
	{
		//pencere oluþturulduðu zaman bir sayý ürectici oluþturuyoruz.
		super();
		rnd = new Random();
		addMouseListener(this);
		//this ifadesi class'a, BizimPencere classýna denk gelir.
		addKeyListener(this);
		x=0;
		y=0;
		
		yazi="Merhaba!";
	}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		
		g.drawString(yazi, x, y);
		
		
	
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1)
		{
			x=e.getX();
			y=e.getY();
			
		}
		
		else if(e.getButton()==MouseEvent.BUTTON3)
		{
			//x2=e.getX();
			//y2=e.getY();
		}
		repaint();
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		//Mevcut olan stringe hangi karakter basýldýysa onun stringini alýr.
				
				if(e.getKeyCode()==e.VK_BACK_SPACE && yazi.length()>0)
				{
					yazi = yazi.substring(0, yazi.length()-1);
				}
				
				else 
				{
					yazi=yazi + e.getKeyChar();
				}
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
			
		
		
		
		
	}

}

