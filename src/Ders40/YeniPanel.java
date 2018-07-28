package Ders40;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
public class YeniPanel extends JPanel implements KeyListener {

	Dortgen a;
	int adim = 5;
	
	public YeniPanel()
	{
		super();
		addKeyListener(this);
		//Panelin ortasýna bir dortgen objesi yerleþtirdik.
		a = new Dortgen(this.getWidth()/2,this.getHeight()/2,20,20);
		
	}
	
	
	
	//JPanelin paintComponent metodunu override ettik. 
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		a.ekranCiz(g);
		
	}


	//Tuþa basmamýzla beraber hareketEt metodunun devreye girmesiyle koordinatlar deðiþiyor, dolayýsýyla karemiz hareket ediyor.
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode()==e.VK_UP)
		{
			a.hareketEt(0, -adim);
			repaint();
		}
		else if(e.getKeyCode()==e.VK_DOWN)
		{
			a.hareketEt(0, adim);
			repaint();
		}
		else if(e.getKeyCode()==e.VK_LEFT)
		{
			a.hareketEt(-adim, 0);
			repaint();
		}
		else if(e.getKeyCode()==e.VK_RIGHT)
		{
			a.hareketEt(+adim, 0);
			repaint();
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
