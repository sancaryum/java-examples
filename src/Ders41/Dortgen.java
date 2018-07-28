package Ders41;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Dortgen {
	
	Rectangle r;
	
	public Dortgen(int x, int y, int width, int height)
	{
		r = new Rectangle(x, y, width, height);
	}
	
	
	public void ekranCiz(Graphics g)
	{
		g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
	}
	
	public void hareketEt(int x,int y, Dortgen[] digerleri, int sayi)
	{	//cakisma false oldu�u zaman cismimizi hareket ettirebiliriz. true yapan durumlarda yerini de�i�tiremeyiz.
		//gecici dikt�rtgeni bizim hareket ettirdi�imiz dikd�rtgendir. 
		Rectangle gecici = new Rectangle(r);
		gecici.setLocation((int)gecici.getX()+x,(int) gecici.getY()+y);
		
		boolean cakisma = false;
		
		for(int i=0; i<sayi;i++)
		{
			if(gecici.intersects((digerleri[i].getRectangle())))
				{
					cakisma=true;
				}
		}
		
		if(gecici.getX()<0||gecici.getY()<0||gecici.getX()>620-gecici.getWidth()||gecici.getY()>460-gecici.getHeight())
		{
			cakisma=true;
		}
		
		if(cakisma==false)
		{
			r.setLocation((int)r.getX()+x,(int)r.getY()+y);	
		}
		
	}
	
	public Rectangle getRectangle()
	{
		return r;
	}
}
