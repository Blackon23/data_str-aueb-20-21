import java.util.Scanner;

public class PostfixToInfix{
	private static Scanner scan;
	
	public boolean isEnable(String exp){
		boolean x = true;
		if (!(isOperator(exp.charAt(exp.length()-1)))) {return !x;}
		for (int i = 0; i < exp.length()-1; i++){
			char y = exp.charAt(i);
			if (!((y >= '0' && y <= '9') || isOperator(y))) {return !x;}
		}
		return x;
	}

	private boolean isOperator(char s3){
		if (s3 == '+' || s3 == '-' || s3 == '*' || s3 == '/') {return true;}	
		return false;
	}

	public String Converter(String exp){
		StringDoubleEndedQueueImpl s = new StringDoubleEndedQueueImpl();
		for (int i = 0; i < exp.length(); i++){
			s.addLast("" + exp.charAt(i));
		}
		for (int i = 0; i < exp.length(); i++){
			char s3 = exp.charAt(i);
			if (isOperator(s3)){
				String s2 = s.removeLast();
				String s1 = s.removeLast();
				s.addLast("(" + s1 + s3 + s2 + ")");
			} 
			else{
				s.addLast("" + s3);
			}
		}
		return s.removeLast();
	}

	public static void main(String[] args){
		PostfixToInfix obj = new PostfixToInfix();
		scan = new Scanner(System.in);
		System.out.print("Enter the postfix: ");
		String expression = scan.next();
		scan.close(); 
		if (obj.isEnable(expression)){
			System.out.println("Conversion to infix: " + obj.Converter(expression));
		}
		else{
			System.out.println("Disable postfix");	
		}
	}
}