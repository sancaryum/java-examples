package Ders42;

import javax.swing.JFrame;

public class pencereDene {

	public static void main(String[] args) {

		
		JFrame pencere = new JFrame("Benim Programým");
		
		//JFrame objesine JPanel componentini eklemiþ olduk.
		YeniPanel panel = new YeniPanel();
		pencere.add(panel);
		pencere.setSize(620,460);
		pencere.setVisible(true);
		
		
		
	}

}
