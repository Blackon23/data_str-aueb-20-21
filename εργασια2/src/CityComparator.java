import java.util.Comparator;
public class CityComparator implements Comparator{
    @Override
    public double compare(City t1, City t2) {
		return t1.getresult() - t2.getresult();
	}
}