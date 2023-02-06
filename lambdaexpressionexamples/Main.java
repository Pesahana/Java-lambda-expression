package lambdaexpressionexamples;

public class Main {
	
	public static void main( String[] args) {
		
		MyInterface ref;
		
		ref = ()-> 4.1415;
		
		System.out.println("Value of Pi = " + ref.getPiValue());
	}

}
