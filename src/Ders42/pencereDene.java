package Ders42;

import javax.swing.JFrame;

public class pencereDene {

	public static void main(String[] args) {

		
		JFrame pencere = new JFrame("Benim Program�m");
		
		//JFrame objesine JPanel componentini eklemi� olduk.
		YeniPanel panel = new YeniPanel();
		pencere.add(panel);
		pencere.setSize(620,460);
		pencere.setVisible(true);
		
		
		
	}

}
