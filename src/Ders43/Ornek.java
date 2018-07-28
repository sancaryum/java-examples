package Ders43;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ornek extends JFrame implements MouseListener {
	
	JLabel label1,label2,label3;
	JPanel panel1;
	
	int sayi=0;
	
	Ornek()
	{
		super();
		//Labellerimizi Panele koyduk. Paneli de Frame'e koyduk.
		panel1 = new JPanel();
		
		label1 = new JLabel("Hoþgeldiniz!");
		panel1.add(label1);
		
		label2 = new JLabel("Deneme....");
		panel1.add(label2);
		
		label3 = new JLabel("" + sayi);
		panel1.add(label3);
		
		add(panel1);
		addMouseListener(this);
		
		
	}

	public static void main(String[] args) {
		
		Ornek pencere = new Ornek();
		pencere.setSize(640, 480);
		pencere.setVisible(true);
	
		
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
		if(e.getButton()==e.BUTTON1)
		{
			System.out.println("sol tuþ");
			sayi++;
			
			
		}
		
		else if(e.getButton()==e.BUTTON3)
		{
			System.out.println("sað tuþ");
			sayi--;
		}
		
		label3.setText("" + sayi);
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
