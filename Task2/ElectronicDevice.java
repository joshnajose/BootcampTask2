package Task2;

public class ElectronicDevice
{
int power,memory,price,reviews;
String modelname;
public ElectronicDevice()
{}
ElectronicDevice(String modelname, int power, int memory, int price, int reviews)
{
	this.modelname=modelname;
	this.power = power;
	this.memory = memory;
	this.price = price;
	this.reviews = reviews;
}
public String getModelName() 
{
	return modelname;
}
public void setModelName(String modelname) 
{
	this.modelname=modelname;
}
public int getPower() 
{
	return power;
}
public void setPower(int power) 
{
	this.power=power;
}
public int getMemory() 
{
	return memory;
}
public void setMemory(int memory) 
{
	this.memory=memory;
}
public int getPrice() 
{
	return price;
}
public void setPrice(int price) 
{
	this.price=price;
}

public int getReviews() 
{
	return reviews;
}
public void setReviews(int reviews) 
{
	this.reviews=reviews;
}
}
