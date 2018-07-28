package Ders46;

import javax.swing.JFrame;

public class FrameDeneme  {
	
	public static void main (String args[]){
		JFrame frame = new JFrame();
		frame.add(new CheckBoxPaneli());
		frame.setVisible(true);
		frame.setBounds(450, 200, 400, 400);
	
	}
	

}
