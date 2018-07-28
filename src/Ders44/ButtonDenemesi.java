package Ders44;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDenemesi extends JPanel implements ActionListener{
	
	JButton button1,button2;
	JLabel label1;
	
	
	public ButtonDenemesi() {
		super();
		button1 = new JButton("Arttýr");
		button1.addActionListener(this);
		button2 = new JButton("Azalt");
		button2.addActionListener(this);
		label1 = new JLabel("0");
		add(button1);
		add(button2);
		add(label1);
	}



	public static void main (String args[])
	{
		JFrame frame = new JFrame("My Program");
		ButtonDenemesi panel1 = new ButtonDenemesi();
		frame.add(panel1);
		frame.setSize(640, 480);
		frame.setVisible(true);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		//label1 i getText ile string cinsinden ifade ettik. Bu string ifadeyi integer.parseInt metoduyla integere çevirdik.Ýþlemi yaptýk.Metni deðiþtirdik(setText).
		
		if(e.getActionCommand().equals("Arttýr"))
		{
			int a =  (Integer.parseInt(label1.getText()));	
			a++;
			label1.setText("" + a );
		}
		
		else if(e.getActionCommand().equals("Azalt"))
		{
			int a =  (Integer.parseInt(label1.getText()));	
			a--;
			label1.setText(""+a);
			
			
		}
		
		//Üstteki arttýr zamazingosunun farklý hali:
		
// 		label1.setText("" + (Integer.parseInt(label1.getText()))+1);		
		
			/*int a = (Integer.parseInt(label1.getText()));
			a++;
			label1.setText("" + a);
		
			int a = (Integer.parseInt(label1.getText()));
			a--;
			label1.setText("" + a ); */
		
		
		
		
		
	}
	
}