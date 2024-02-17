import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class DynamicCovid_k_withPQ{
	public double getresult(){
		double x = 50000*city.getCovidCases()/city.getPopulation();
		double rounded = Math.round(x * 100.0) / 100.0;
		return rounded;
	}
	
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("path\file.txt"));
		String line = reader.readLine();
		PriorityQueueInterface pq = new HeapPriorityQueue(new CityComparator());
		int n = 0;
		if (n = 0){
			double min = city.getresult();
		}
		while (n <= k) {
			n++;
			String[] data = line;
			City city = new City();
			city.setID(Integer.parseInt(data[0]));
			city.setName(data[1]);
			city.setPopulation(Integer.parseInt(data[2]));
			city.setCovidCases(Integer.parseInt(data[3]));
			pq.insert(city);
			city.getresult();
			if (city.getresult() < min){
				min = city.getresult()
				minkcity = city;
			}
			line = reader.readLine();
		}
		for (line != null; n++){
			String[] data = line;
			City city = new City();
			city.setID(Integer.parseInt(data[0]));
			city.setName(data[1]);
			city.setPopulation(Integer.parseInt(data[2]));
			city.setCovidCases(Integer.parseInt(data[3]));
			if (comparator.compare(minkcity, city) < 0){
				pq.revome(minkcity.getID());
				pq.insert(city);
				minkcity = city;
			}
			if (n%5 = 0){
				for (i=0; i<=k; i++){
					pq.getmax();
				}
			}
		}
	}
}