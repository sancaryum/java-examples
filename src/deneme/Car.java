package deneme;

public class Car {
private String brand;

Animal binmishayvan,binecekhayvan;

//CONSTRUCTORS
public Car()
{
	brand="unbrand";
}

public Car(String brand)
{
	this.brand=brand;
}

public void bin(Animal binecekhayvan)
{	
	if (binmishayvan==null)
	{
	binmishayvan=binecekhayvan;
	System.out.println(binmishayvan.getName() +" " + brand + " arabasına başarıyla bindi.");
	}
	else
	{
	System.out.println("Zaten " + brand + " arabasına " +  binmishayvan.getName() + " binmiş!");
	}

}




public void in()	
{
	if(binmishayvan==null)
	{
	System.out.println(brand +" arabası zaten boş!");
	}

	else
	{
	System.out.println(binmishayvan.getName() + " " + brand +  " arabasından indi");
	binmishayvan=null;
	}
}




}



	






	








