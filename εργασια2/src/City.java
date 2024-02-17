import java.util.ArrayList;
import java.util.Comparator;
public class City implements CityInterface, Comparable<City> {
	int ID;
	String name;
	int population;
	int CovidCases;
	
	public City(int ID, String name, int population, int CovidCases){
		this.ID = ID;
		this.name = name;
		this.population = population;
		this.CovidCases = CovidCases;
	}
	
	public int getID(){
		if (ID > 0 && ID < 1000) {return ID;}
	}
	
	public String getName(){
		if (name.length()<=50) {return name;}
	}
	
	public int getPopulation(){
		if (population > 0 && population <= 10000000) {return population;}
	}
	
	public int getCovidCases(){
		return CovidCases;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPopulation(int population){
		this.population = population;
	}
	
	public void setCovidCases(int CovidCases){
		this.CovidCases = CovidCases;
	}
}

