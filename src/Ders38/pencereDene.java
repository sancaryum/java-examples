package Ders38;

import javax.swing.JFrame;

public class pencereDene {

	public static void main(String[] args) {
//		BizimPencere pencere = new BizimPencere();
//		pencere.setSize(640,480);
//		pencere.setVisible(true);
		
		JFrame pencere2 = new JFrame("Benim Programým");
		//JFrame objesine JPanel componentini eklemiþ olduk.
		pencere2.add(new KarePencere());
		//KarePencere pencere2 = new KarePencere();
		pencere2.setSize(500,500);
		pencere2.setVisible(true);
		
		
		
	}

}
