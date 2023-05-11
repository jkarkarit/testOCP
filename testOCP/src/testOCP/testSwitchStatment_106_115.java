package testOCP;

/**
 * @author Mars
 *
 */
public class testSwitchStatment_106_115 {
	// @formatter:off
	
	////////////////////////////////////////////////////////////////
	static final int getCookies() {return 4;}
	
	void feedAnimals() {
		final int bananas =1;
		
		@SuppressWarnings("unused")
		int apples = 2;
		
		int numberOfAnimals = 3;
		
		@SuppressWarnings("unused")
		final int cookies = getCookies();
		
		switch (numberOfAnimals) {
		case bananas		:
		case 3 * 5 			:
		
		// case getCookies()	:	// does not compile
		// case cookies 		:	// does not compile
		// case apples 		:	// does not compile
		
		}
	}
	
	
	////////////////////////////////////////////////////////////////
	static void printDayOfWeek(int day) {
		switch(day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid value");
			break;
		}
	}
	

	////////////////////////////////////////////////////////////////
	static void printSeason(int month) {
		 switch(month) {
		 case 1, 2, 3: System.out.print("Winter");
		 case 4, 5, 6: System.out.print("Spring");
		 default: System.out.print("Unknown");
		 case 7, 8, 9: System.out.print("Summer");
		 case 10, 11, 12: System.out.print("Fall");
		 } }

	////////////////////////////////////////////////////////////////
	void compareIntegers(Number number) {

		// @formatter:off
		if (number instanceof Integer data)
			System.out.println(data);
		
		if (number instanceof Integer data && data.compareTo(5)>0)
			System.out.println(data);
	}

	////////////////////////////////////////////////////////////////
	static void printIntegersOrNumbesGreaterThan5(Number number) {
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
	}

	static void printIntegersOrNumbesGreaterThan6(Integer integer) {
		if (integer instanceof Integer data)
			System.out.println(data);
		
		if (integer instanceof Integer data && data.compareTo(6)>0)
			System.out.println(data);
		
		// does not compile: compiler cannot guarantee that data is
		// an instance of Integer
		/*
		if (number instanceof Integer data || data.compareTo(5)>0)
			System.out.println(data);
		**/
	}

	// @formatter:on
	
	
	
	
	
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// @formatter:off
		Integer valueInteger	= 1;
		Number	valueNumber 	= 2;
		
				
		// test t = new test();
		// t.compareIntegers(valueNumber);
		// t.compareIntegers(valueInteger);
		
		
		// test.printSeason(2); 
		testSwitchStatment_106_115.printDayOfWeek(2); 
		testSwitchStatment_106_115.printDayOfWeek(0); 
		testSwitchStatment_106_115.printDayOfWeek(200); 

if (false) {
		if (valueInteger instanceof Integer){System.out.println(1);}
		if (valueInteger instanceof Integer data) {System.out.println(data = 10);}

		if (valueNumber instanceof Integer) {System.out.println(2);}
		if (valueNumber instanceof Integer data) {System.out.println(data = 20);}
		

		
		valueInteger	= 123;
		valueNumber 	= 456;
		testSwitchStatment_106_115.printIntegersOrNumbesGreaterThan5(valueInteger); // Integer is also a Number
		testSwitchStatment_106_115.printIntegersOrNumbesGreaterThan5(valueNumber);  // Number is a Number
 		// test.printIntegersOrNumbesGreaterThan6(valueInteger);
    	// test.printIntegersOrNumbesGreaterThan6(valueNumber);
		}
}

		// @formatter:on
}