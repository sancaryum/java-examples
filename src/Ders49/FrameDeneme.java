package Ders49;

import javax.swing.JFrame;

public class FrameDeneme {

	public static void main (String args[]){
		JFrame frame = new JFrame();
		SoruDeneme panel1 = new SoruDeneme();
		panel1.sorular�Olustur();
		panel1.sorular�EkranaYans�t(0);
		frame.add(panel1);
		frame.setBounds(400, 400, 300, 300);
		frame.setVisible(true);
		
		
		
	}
	
}
