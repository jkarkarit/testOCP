package testOCP;

/**
 * @author Mars
 *
 */
/**
 * @author Mars
 *
 */
public class test {

	static void printIntegersOrNumbesGreaterThan5(Number number) {
		// @formatter:off
		if (number instanceof Integer data)
			System.out.println(data);
		
		if (number instanceof Integer data && data.compareTo(5)>0)
			System.out.println(data);
		
		
		// does not compile: compiler cannot guarantee that data is
		// an instance of Integer
		/*
		if (number instanceof Integer data || data.compareTo(5)>0)
			System.out.println(data);
		**/
		
		
		
		// @formatter:on

	}

	public static void main(String[] args) {

		// @formatter:off
		Integer valueInteger	= 1;
		Number	valueNumber 	= 2;
		
		if (valueInteger instanceof Integer){System.out.println(1);}
		if (valueNumber instanceof Integer data) {System.out.println(2);}

		
		valueInteger	= 123;
		valueNumber 	= 456;
		test.printIntegersOrNumbesGreaterThan5(valueInteger);
		test.printIntegersOrNumbesGreaterThan5(valueNumber);
		
		// @formatter:on
		
	}

}