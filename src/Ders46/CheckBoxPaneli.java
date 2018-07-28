package Ders46;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckBoxPaneli extends JPanel implements ActionListener {
	
	//Bu class JPaneli extend etti�i i�in bir paneldir. Ve constructorda eklenen componentler yer belirtmeye(this.) gerek kalmadan
	//add dedi�imizde bu panele yerle�tirilir. Butona t�klad���m�zda bir �ey olmas� i�in ise o butona actionListener eklenir.
	//Birden fazla buton oldu�unda butonlar� ay�rt etmesi i�in actionPerformed i�inde ko�ul ifadesi ile eklenen butonlar�n aras�ndan
	//tetiklenen her buton i�in ayr� i�lem yapt�r�labilir.
	
	JCheckBox check1,check2;
	JButton button1;

	
	public CheckBoxPaneli() {
		check1 = new JCheckBox("Yurtta kal�yor");
		check2 = new JCheckBox("Burslu");
		button1 = new JButton("Onayla");
		//CheckBoxPaneli class�nda olu�turulan panele eklenen button1'e t�klad���m�z zaman yap�lacak i�lem i�in button1'e actionListener ekledik.
		button1.addActionListener(this);
		add(check1);
		add(check2);
		add(button1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//CheckBoxta tik varm� yokmu kontrol etmek i�in.
		String s = "Se�ti�iniz ��renci: ";
		
		if(check1.isSelected()==true&&check2.isSelected()==false)
		{
			s = s +  check1.getText();
			JOptionPane.showMessageDialog(this, s);
		}
		
		else if (check1.isSelected()==false&&check2.isSelected()==true)
		{
			s=s+check2.getText();
			JOptionPane.showMessageDialog(this, s );
		}
		
		else if(check1.isSelected()==true && check2.isSelected()==true )
		{
			s = s + check1.getText() + " ve " + check2.getText();
			JOptionPane.showMessageDialog(this, s );
		}
		
	}
	
	
	//	Bu panelde g�stermesini istedi�imiz i�in parentcomponenti this yapt�k.
	// JOptionPane.showMessageDialog(this, s );

}
