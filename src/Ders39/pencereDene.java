package Ders39;

import javax.swing.JFrame;

public class pencereDene {

	public static void main(String[] args) {

		
		JFrame pencere = new JFrame("Benim Program�m");
		KarePencere panel1 = new KarePencere();
		//JFrame objesine JPanel componentini eklemi� olduk.
		pencere.add(panel1);
		pencere.addKeyListener(panel1);
		//KarePencere pencere2 = new KarePencere();
		pencere.setSize(500,500);
		pencere.setVisible(true);
		
		
		
	}

}
