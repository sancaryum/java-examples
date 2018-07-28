package Ders47;

import javax.swing.JFrame;

public class FrameDene {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My Program");
		frame.add( new RadioButtonPaneli());
		frame.setBounds(200, 200, 400, 400);
		frame.setVisible(true);
		
		
	}

}
