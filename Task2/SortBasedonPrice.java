package Task2;
import java.util.Comparator;
public class SortBasedonPrice implements Comparator<ElectronicDevice>
{
	@Override
	public int compare(ElectronicDevice o1, ElectronicDevice o2) 
	{
		return o1.getPrice() - o2.getPrice();
	}
	
}


