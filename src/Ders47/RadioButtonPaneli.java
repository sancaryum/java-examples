package Ders47;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonPaneli extends JPanel implements ActionListener {
	
	//Oluþturmalar
	JRadioButton radio1,radio2,radio3,radio4;
	JRadioButton r1,r2;
	ButtonGroup grup1,grup2;
	JLabel label1,label2;
	JButton button1;
	
	
	public RadioButtonPaneli()
	{
		//Tanýmlamalar
		label1 = new JLabel("Sýnýfýnýzý seçiniz: ");
		button1 = new JButton("Seç: ");
		grup1 = new ButtonGroup();
		radio1= new JRadioButton("1.Sýnýf");
		radio2= new JRadioButton("2.Sýnýf");
		radio3= new JRadioButton("3.Sýnýf");
		radio4= new JRadioButton("4.Sýnýf");
		
		//Gruplamalar 
		//radioButtonlarý grup1'e ekledik. Ayný grubun içindeki butonlardan sadece 1'ini seçebiliriz. 
		grup1.add(radio1);
		grup1.add(radio2);
		grup1.add(radio3);
		grup1.add(radio4);
		
		
		//Eklemeler
		add(label1);
		//buttonlardan sadece 1'ini seçebilmemiz için butonlarý hem gruba hem de panele ekliyoruz.
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		
		
		
		//2-Tanýmlamalar
		r1= new JRadioButton("Erkek");
		r2= new JRadioButton("Kadýn");
		label2 = new JLabel("Cinsiyetinizi seçiniz: ");
		grup2 = new ButtonGroup();
		
		//2-Gruplamalar
		grup2.add(r1);
		grup2.add(r2);
	
		//2-Eklemeler
		add(label2);
		add(r1);
		add(r2);
		
		add(button1);
		
		
		
		//ActionListener Eklemeler
		button1.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	String x = "Seçilen sýnýf: ";
	String y = " Seçilen cinsiyet: ";
	
	
	if(e.getActionCommand()=="Seç: " && radio1.isSelected() && r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio1.getText() + y + r1.getText() );
	}
	
	else if (e.getActionCommand()=="Seç: " &&radio2.isSelected()&& r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio2.getText()+ y + r1.getText());
	}
	
	else if (e.getActionCommand()=="Seç: " &&radio3.isSelected()&& r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio3.getText()+ y + r1.getText());
	}
	
	else if (e.getActionCommand()=="Seç: " &&radio4.isSelected()&& r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio4.getText()+ y + r1.getText());
	}
	
//	else 
//	{
//		JOptionPane.showMessageDialog(this, "Sýnýf seçiniz!" );
//	}
	
	if(e.getActionCommand()=="Seç: " && radio1.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio1.getText() + y + r2.getText() );
	}
	
	else if(e.getActionCommand()=="Seç: " && radio2.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio2.getText() + y + r2.getText() );
	}
	
	else if(e.getActionCommand()=="Seç: " && radio3.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio3.getText() + y + r2.getText() );
	}
	
	else if(e.getActionCommand()=="Seç: " && radio4.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio4.getText() + y + r2.getText() );
	}
	
//	else 
//	{
//		JOptionPane.showMessageDialog(this,"Cinsiyet giriniz!");
//	}
//	
	
	
	
	
		
	
		
	
	}
		
		
		
	}


