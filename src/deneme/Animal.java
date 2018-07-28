package deneme;

import java.util.Scanner;
public class Animal {
Scanner scan = new Scanner(System.in);
private String name,kind;

public Animal()
{
	name="unnamed";
	kind="unisex";
}

public Animal (String tokenname, String tokenkind)
{
	name =tokenname;
	kind=tokenkind;
}


public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name=name;
}

public String getKind()
{
	return kind;
}

public void setKind(String kind) 
{
	this.kind=kind;
}








}

