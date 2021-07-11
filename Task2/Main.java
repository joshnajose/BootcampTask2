package Task2;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class Main {
public static void main(String args[])
{
	Map<String, List<ElectronicDevice>> emap=new HashMap<>();
	ElectronicDevice a1=new Laptop("HPpavilion",30,8,45000,2);
	ElectronicDevice a2=new Laptop("AsusZenbook",40,16,55000,3);
	ElectronicDevice a3=new Laptop("LenovoThinkpad",50,4,35000,4);
	ElectronicDevice a4=new Laptop("DellLatitude",20,10,65000,5);
	List<ElectronicDevice> laptoplist=new ArrayList<>();
	laptoplist.add(a1);
	laptoplist.add(a2);
	laptoplist.add(a3);
	laptoplist.add(a4);
	emap.put("Laptop", laptoplist);
	ElectronicDevice b1=new Phone("OneplusNord",4,64,40000,5);
	ElectronicDevice b2=new Phone("SamsungS20",5,32,30000,3);
	ElectronicDevice b3=new Phone("Iphone12",6,56,70000,4);
	ElectronicDevice b4=new Phone("RedmiNote10",7,18,20000,2);
	List<ElectronicDevice> phonelist=new ArrayList<>();
	phonelist.add(b1);
	phonelist.add(b2);
	phonelist.add(b3);
	phonelist.add(b4);
	emap.put("Phone", phonelist);
	ElectronicDevice c1=new Camera("CanonEOS",5,128,56000,4);
	ElectronicDevice c2=new Camera("SonyAlpha",6,64,76000,5);
	ElectronicDevice c3=new Camera("NikonD3500",7,32,66000,3);
	ElectronicDevice c4=new Camera("FujifilmXA7",8,16,10000,2);
	List<ElectronicDevice> cameralist=new ArrayList<>();
	cameralist.add(c1);
	cameralist.add(c2);
	cameralist.add(c3);
	cameralist.add(c4);
	emap.put("Camera", cameralist);
	Iterator<String> itr=emap.keySet().iterator();
	while(itr.hasNext())
	{
		
		String name = itr.next();
		
		
		if(name.equals("Phone"))
		{
			List<ElectronicDevice> edevices = emap.get(name);
			
			for (ElectronicDevice device : edevices) {
				if(device.getPrice()>=25000 && device.getPrice()<=70000)
				{
					System.out.println(device.modelname);
				}
			}
		}
		else if(name.equals("Laptop"))
		{
			List<ElectronicDevice> edevices = emap.get(name);
			
			for (ElectronicDevice device : edevices) {
				if(device.getPrice()>=35000 && device.getPrice()<=65000)
				{
					System.out.println(device.modelname);
				}
			}
		}
	}
	Collections.sort(phonelist,new SortBasedonReview());
	doPrint(phonelist,"Phones sorted based on Reviews in ascending order");
	Collections.sort(phonelist,new SortBasedonPrice());
	doPrint(phonelist,"Phones sorted based on Price in ascending order");
	Collections.sort(laptoplist,new SortBasedonReview());
	doPrint(laptoplist,"Laptops sorted based on Reviews in ascending order");
	Collections.sort(laptoplist,new SortBasedonPrice());
	doPrint(laptoplist,"Laptops sorted based on Price in ascending order");
}
public static void doPrint(Collection<ElectronicDevice> collection,String tagLine)
{
	System.out.println("\n"+tagLine);
	
	for (ElectronicDevice device : collection) {
		System.out.println(device.modelname);
	}
}
}

