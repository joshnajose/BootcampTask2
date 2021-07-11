package Task2;

public class Laptop extends ElectronicDevice{
		public Laptop() 
		{
			super();
		}
		public Laptop(String modelname, int power, int memory, int price, int reviews)
		{
			super(modelname,power,memory,price,reviews);
		}
	public void Portablity()
	{
		System.out.println("Laptop is portable unit");
	}
	}
