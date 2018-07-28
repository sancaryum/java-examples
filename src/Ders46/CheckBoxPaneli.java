package Ders46;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckBoxPaneli extends JPanel implements ActionListener {
	
	//Bu class JPaneli extend ettiði için bir paneldir. Ve constructorda eklenen componentler yer belirtmeye(this.) gerek kalmadan
	//add dediðimizde bu panele yerleþtirilir. Butona týkladýðýmýzda bir þey olmasý için ise o butona actionListener eklenir.
	//Birden fazla buton olduðunda butonlarý ayýrt etmesi için actionPerformed içinde koþul ifadesi ile eklenen butonlarýn arasýndan
	//tetiklenen her buton için ayrý iþlem yaptýrýlabilir.
	
	JCheckBox check1,check2;
	JButton button1;

	
	public CheckBoxPaneli() {
		check1 = new JCheckBox("Yurtta kalýyor");
		check2 = new JCheckBox("Burslu");
		button1 = new JButton("Onayla");
		//CheckBoxPaneli classýnda oluþturulan panele eklenen button1'e týkladýðýmýz zaman yapýlacak iþlem için button1'e actionListener ekledik.
		button1.addActionListener(this);
		add(check1);
		add(check2);
		add(button1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//CheckBoxta tik varmý yokmu kontrol etmek için.
		String s = "Seçtiðiniz öðrenci: ";
		
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
	
	
	//	Bu panelde göstermesini istediðimiz için parentcomponenti this yaptýk.
	// JOptionPane.showMessageDialog(this, s );

}
