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
	
	//Olu�turmalar
	JRadioButton radio1,radio2,radio3,radio4;
	JRadioButton r1,r2;
	ButtonGroup grup1,grup2;
	JLabel label1,label2;
	JButton button1;
	
	
	public RadioButtonPaneli()
	{
		//Tan�mlamalar
		label1 = new JLabel("S�n�f�n�z� se�iniz: ");
		button1 = new JButton("Se�: ");
		grup1 = new ButtonGroup();
		radio1= new JRadioButton("1.S�n�f");
		radio2= new JRadioButton("2.S�n�f");
		radio3= new JRadioButton("3.S�n�f");
		radio4= new JRadioButton("4.S�n�f");
		
		//Gruplamalar 
		//radioButtonlar� grup1'e ekledik. Ayn� grubun i�indeki butonlardan sadece 1'ini se�ebiliriz. 
		grup1.add(radio1);
		grup1.add(radio2);
		grup1.add(radio3);
		grup1.add(radio4);
		
		
		//Eklemeler
		add(label1);
		//buttonlardan sadece 1'ini se�ebilmemiz i�in butonlar� hem gruba hem de panele ekliyoruz.
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		
		
		
		//2-Tan�mlamalar
		r1= new JRadioButton("Erkek");
		r2= new JRadioButton("Kad�n");
		label2 = new JLabel("Cinsiyetinizi se�iniz: ");
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
	String x = "Se�ilen s�n�f: ";
	String y = " Se�ilen cinsiyet: ";
	
	
	if(e.getActionCommand()=="Se�: " && radio1.isSelected() && r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio1.getText() + y + r1.getText() );
	}
	
	else if (e.getActionCommand()=="Se�: " &&radio2.isSelected()&& r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio2.getText()+ y + r1.getText());
	}
	
	else if (e.getActionCommand()=="Se�: " &&radio3.isSelected()&& r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio3.getText()+ y + r1.getText());
	}
	
	else if (e.getActionCommand()=="Se�: " &&radio4.isSelected()&& r1.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio4.getText()+ y + r1.getText());
	}
	
//	else 
//	{
//		JOptionPane.showMessageDialog(this, "S�n�f se�iniz!" );
//	}
	
	if(e.getActionCommand()=="Se�: " && radio1.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio1.getText() + y + r2.getText() );
	}
	
	else if(e.getActionCommand()=="Se�: " && radio2.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio2.getText() + y + r2.getText() );
	}
	
	else if(e.getActionCommand()=="Se�: " && radio3.isSelected() && r2.isSelected())
	{
		JOptionPane.showMessageDialog(this, x + radio3.getText() + y + r2.getText() );
	}
	
	else if(e.getActionCommand()=="Se�: " && radio4.isSelected() && r2.isSelected())
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


