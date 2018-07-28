package Ders45;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
////Button yerine enter ile ekliyoruz.
public class TextFieldDenemesi2  extends JPanel implements ActionListener{
	
		//VARIABLES
		JTextField textField2;
		JLabel label2;
		
		//CONSTRUCTOR
		public TextFieldDenemesi2() {
			super();
			textField2 = new JTextField(15);
			
			add(label2);
			add(textField2);
			textField2.addActionListener(this);
			
		}

		//MAIN
		public static void main (String args[]){
			JFrame frame2 = new JFrame ("My Program");
			TextFieldDenemesi2 panel2 = new TextFieldDenemesi2();
			frame2.add(panel2);
			frame2.setSize(300, 300);
			frame2.setVisible(true);
			
			
			
		}

		//METHODS
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 	//label1 i getText ile string cinsinden ifade ettik. Bu string ifadeyi integer.parseInt metoduyla integere çevirdik.Ýþlemi yaptýk.Metni deðiþtirdik(setText).
			
				label2.setText(label2.getText() + " " + textField2.getText() );
				textField2.setText("");
				textField2.requestFocus();
			
			
			
		}

		
		
		
	


	}
		
	