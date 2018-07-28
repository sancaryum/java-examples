package Ders42;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;
public class YeniPanel extends JPanel implements ActionListener,MouseListener{

	Dortgen a;
	int adim = 5;
	Dortgen[] digerleri;
	int elemanSayisi=5;
	Timer zaman;
	Random random = new Random();
	
	public YeniPanel()
	{
		super();
		zaman = new Timer(40,this);
		zaman.start();
		addMouseListener(this);
		
		digerleri = new Dortgen[5000];
		digerleri[0]= new Dortgen(random.nextInt(600),random.nextInt(440),20,20,random.nextInt(10),random.nextInt(10));
		digerleri[1]= new Dortgen(random.nextInt(600),random.nextInt(440),20,20,random.nextInt(10),random.nextInt(10));
		digerleri[2]= new Dortgen(random.nextInt(600),random.nextInt(440),20,20,random.nextInt(10),random.nextInt(10));
		digerleri[3]= new Dortgen(random.nextInt(600),random.nextInt(440),20,20,random.nextInt(10),random.nextInt(10));
		digerleri[4]= new Dortgen(random.nextInt(600),random.nextInt(440),20,20,random.nextInt(10),random.nextInt(10));
		
		
	}
	
	
	
	//JPanelin paintComponent metodunu override ettik. 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(0, 0, 620, 460);
		
		for(int i = 0 ; i<elemanSayisi ; i++)
		{
			digerleri[i].ekranCiz(g);
		}
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		for(int i = 0 ; i<elemanSayisi ; i++)
		{
			digerleri[i].hareketEt(digerleri,elemanSayisi);
		}
		repaint();
		
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void mousePressed(MouseEvent e) {
		digerleri[elemanSayisi]=digerleri[1]= new Dortgen(e.getX(),e.getY(),20,20,random.nextInt(10),random.nextInt(10));
		elemanSayisi++;
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	
}
