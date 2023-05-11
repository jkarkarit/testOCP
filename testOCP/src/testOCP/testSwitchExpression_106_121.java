package testOCP;


/**
 * @author Mars
 *
 */
public class testSwitchExpression_106_121 {
	// @formatter:off
	
	////////////////////////////////////////////////////////////////
	enum Season {WINTER, SPRING, SUMMER, FALL}
	static String getWeather(Season value) {
		return switch(value) {
			case WINTER -> "cold";
			case SPRING -> "Rainy";
			case SUMMER -> "Hot";
			case FALL   -> "Warm";
		};
		
	}
	
	
	
	////////////////////////////////////////////////////////////////
	// @formatter:off
	static void printDayOfWeek(int day) {
		var result = switch(day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid value";
		// default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};
		System.out.println("result :" + result);
	}
	
	
	

	////////////////////////////////////////////////////////////////
	// @formatter:off
	static void printSeason(int month) {
		 switch(month) {
		 case 1, 2, 3 -> System.out.print("Winter");
		 case 4, 5, 6 -> System.out.print("Spring");
		 // default -> System.out.print("Unknown");
		 case 7, 8, 9 -> System.out.print("Summer");
		 case 10, 11, 12 -> System.out.print("Fall");
		 } 
	}
	
	
	

	// #120 ////////////////////////////////////////////////////////
	// @formatter:off
	static void printAnimals(int canis) {

		// does not compile without defalut case 
		// in order to cover all int <> 1,2,3
		// VIP! - every switch expression must handle all possible values 
		String type = switch(canis) {  
			 case 1 -> "dog";
			 case 2 -> "wolf";
			 case 3 -> "coyote";
		     default -> "Unknown";
		 };
		 System.out.println("printAnimals " + canis + ": " + type);
	}
	
	
	
	

	////////////////////////////////////////////////////////////////

// @formatter:on

	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// @formatter:off
		

		if (false) {
			
			String weather =  testSwitchExpression_106_121.getWeather(Season.WINTER);
			System.out.println(weather);
			
			testSwitchExpression_106_121.printAnimals(3);
			testSwitchExpression_106_121.printAnimals(4);

			testSwitchExpression_106_121.printDayOfWeek(100);
			testSwitchExpression_106_121.printDayOfWeek(1);
			
			testSwitchExpression_106_121.printSeason(13);
		} // if
		
	} // main
// @formatter:on
}