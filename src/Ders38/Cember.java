package Ders38;

import java.awt.Graphics;

public class Cember {
	
	int x,y;
	int genislik;
	
	
	
	public Cember(int x, int y, int genislik) {
		super();
		this.x = x;
		this.y = y;
		this.genislik = genislik;
	}



	public void ekranCiz(Graphics g)
	{
		g.drawOval(x, y, genislik, genislik);
	}
	
	
	
	//ActionPerformed'in yerine gelen metod. Aynı işlevde.
	public void genisle(int i) 
	{
		//Büyürken kaymasın diye bu şekilde çıkarmta yaptık.
		x = x - (i/2);
		y = y - (i/2);
		genislik = genislik + 1 ;
	}
	
	
	
}
