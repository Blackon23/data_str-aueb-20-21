import java.util.Scanner;

public class DNAPalindrome{

	public boolean isEnable(String DNA){
		boolean x = true;
		for (int i = 0; i < DNA.length(); i++){
			char y = DNA.charAt(i);
			if (y != 'A' && y != 'T' && y != 'G' && y != 'C') {return !x;}
		}
		return x;
	}
	
	public boolean Complemental(String f, String l){
		if (((f.equals("A")) && (l.equals("T"))) || ((f.equals("T")) && (l.equals("A")))) {
			return true;
		}
		else if (((f.equals("G")) && (l.equals("C"))) || ((f.equals("C")) && (l.equals("G")))) {
			return true;
		}
		else{ 
			return false;
		}
	}
	
	public boolean WatsonCrick(String DNA){
		StringDoubleEndedQueueImpl d = new StringDoubleEndedQueueImpl();
		for (int i = 0; i < DNA.length(); i++){
			d.addLast(String.valueOf(DNA.charAt(i)));
		}
		boolean x = true;
		while (!(d.isEmpty()) && x){
			x = Complemental(d.removeFirst(), d.removeLast());
		}
		return x;
	}
	
	public static void main(String[] args){
		DNAPalindrome object = new DNAPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DNA sequence");
		String DNA = sc.next();	
		sc.close(); 
		if (DNA.length() % 2 == 0) {
			if (object.isEnable(DNA)){
				System.out.println("The sentence: <<The DNA sequence is Watson-Crick complemented palindrome>> is " + object.WatsonCrick(DNA));
			}
			else {
				System.out.println("Not able DNA sequence");
			}
		}
		else if (DNA == " ") {
			System.out.println("The sentence: <<The DNA sequence is Watson-Crick complemented palindrome>> is true");
		}
		else {
			System.out.println("Not able DNA sequence");
		}
	}
}