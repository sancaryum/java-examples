package Ders40;

import javax.swing.JFrame;

public class pencereDene {

	public static void main(String[] args) {

		
		JFrame pencere = new JFrame("Benim Program�m");
		
		//JFrame objesine JPanel componentini eklemi� olduk.
		YeniPanel panel = new YeniPanel();
		pencere.add(panel);
		pencere.addKeyListener(panel);
		pencere.setSize(500,500);
		pencere.setVisible(true);
		
		
		
	}

}
