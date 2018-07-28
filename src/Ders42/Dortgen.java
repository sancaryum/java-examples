package Ders42;

import java.awt.Graphics;
import java.awt.Rectangle;


public class Dortgen {
	
	Rectangle r;
	
	int vX, vY;
	
	public Dortgen(int x, int y, int width, int height, int vX, int vY)
	{
		r = new Rectangle(x, y, width, height);
		this.vX=vX;
		this.vY=vY;
	}
	
	
	public void ekranCiz(Graphics g)
	{
		g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
	}
	
	public void hareketEt(Dortgen[] digerleri, int sayi)
	{	
		
		//cakisma false olduðu zaman cismimizi hareket ettirebiliriz. true yapan durumlarda yerini deðiþtiremeyiz.
		
		Rectangle gecici = new Rectangle(r);
		gecici.setLocation((int)gecici.getX()+vX,(int) gecici.getY()+vY);
		
		boolean cakisma = false;
		
		for(int i=0; i<sayi;i++)
		{
			//Eðer cisim kendisiyle çarpýþmýyorsa ve ortada bir çarpýþma varsa cakýþma var demektir.
			if((!this.equals(digerleri[i])) && gecici.intersects((digerleri[i].getRectangle())))
				{
				System.out.println("ÇAKIÞMA!");
					cakisma=true;
				}
		}
		
		if(gecici.getX()<0||gecici.getY()<0||gecici.getX()>620-gecici.getWidth()||gecici.getY()>460-gecici.getHeight())
		{
			cakisma=true;
		}
		
		if( cakisma==false)
		{
			
			r.setLocation((int)r.getX()+vX,(int)r.getY()+vY);	
		}
		
		else
		{
			vX = -vX;
			vY = -vY;
		}
		
	}
	
	public Rectangle getRectangle()
	{
		return r;
	}
}
