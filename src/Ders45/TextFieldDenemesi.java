package Ders45;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldDenemesi extends JPanel implements ActionListener {
	
	//VARIABLES
	JTextField textField1;
	JButton button1;
	JLabel label1;
	
	//CONTRUCTOR
	public TextFieldDenemesi() {
		super();
		textField1 = new JTextField(15);
		button1 = new JButton("Tamam");
		//Bu classta yani panelde button1 e týklanýldýðý zaman bir þey olmasý için actionListener ekledik.
		button1.addActionListener(this);
		//this olmadan da yazýlýr. JPanelin alt sýnýfý olan TextFieldDenemesi classýndan oluþturulan panellere ekler.
		label1 = new JLabel();
		
		add(label1);
		add(textField1);
		add(button1);
	}

	//MAIN
	public static void main (String args[]){
		JFrame frame = new JFrame ("My Program");
		TextFieldDenemesi panel1 = new TextFieldDenemesi();
		frame.add(panel1);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
		
	}

	//METHODS
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//label1 i getText ile string cinsinden ifade ettik. Bu string ifadeyi integer.parseInt metoduyla integere çevirdik.Ýþlemi yaptýk.Metni deðiþtirdik(setText).
		
		if(e.getActionCommand().equals("Tamam")&& textField1.getText().length()>0&& textField1.getText().length()<20)
		{
			label1.setText(label1.getText() + " " + textField1.getText() );
			textField1.setText("");
			textField1.requestFocus();
		}
		
		else if(e.getActionCommand().equals("Azalt"))
		{
			/*int a =  (Integer.parseInt(label1.getText()));	
			a--;
			label1.setText(""+a);*/
		}
	}
	
	
	//52.satýrda özel þartlar    && textField1.getText().length()>0&& textField1.getText().length()<20


}
	
