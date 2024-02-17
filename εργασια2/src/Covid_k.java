import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
public class Covid_k {
	private double calculateDensity(int p, int c){
		double x = 50000*c / p;
		double rounded = Math.round(x * 100.0) / 100.0;
		return rounded;
	}
	
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
		String line = reader.readLine();
		ArrayList<City> cityList = new ArrayList<City>();
		int n = 0;
		while (line != null) {
			n++;
			String[] data = line;
			City city = new City();
			city.setID(Integer.parseInt(data[0]));
			city.setName(data[1]);
			city.setPopulation(Integer.parseInt(data[2]));
			city.setCovidCases(Integer.parseInt(data[3]));
			line = reader.readLine();
		}
		reader.close();
		Scanner k = new Scanner(System.in);
		System.out.println("Enter a number of cities");
		if (k > n){
			System.out.printil("Disable numbler of cities");
		}
		else{
			double[] reduction = new double[n];
			for (i=0; i<=n; i++){
				reduction[i] = calculateDensity(cityList.get(i).getPopulation(), cityList.get(i).getCovidCases());
			}
			quickSort(reduction, 0, reduction.size()-1, cityList);
			for (i=0; i<=k; i++){
				System.out.printil(cityList.get(i).getName());
			}
		}
	}	 
}