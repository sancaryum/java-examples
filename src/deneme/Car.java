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
	System.out.println(binmishayvan.getName() +" " + brand + " arabas�na ba�ar�yla bindi.");
	}
	else
	{
	System.out.println("Zaten " + brand + " arabas�na " +  binmishayvan.getName() + " binmi�!");
	}

}




public void in()	
{
	if(binmishayvan==null)
	{
	System.out.println(brand +" arabas� zaten bo�!");
	}

	else
	{
	System.out.println(binmishayvan.getName() + " " + brand +  " arabas�ndan indi");
	binmishayvan=null;
	}
}




}



	






	








