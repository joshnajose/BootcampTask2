package Task2;
import java.util.Comparator;
public class SortBasedonReview implements Comparator<ElectronicDevice>
{
	@Override
	public int compare(ElectronicDevice o1,ElectronicDevice o2)
	{
		return o1.getReviews()-o2.getReviews();
	}
}