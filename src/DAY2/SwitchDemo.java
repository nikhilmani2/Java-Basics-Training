package DAY2;

public class SwitchDemo {

	public static void main(String[] args) {
		String weekdays="Sunday";
		switch(weekdays) {
		case "Monday":
			System.out.println("Start of the week");
			break;
		case "Tuesday":
			System.out.println("Week day 2");
			break;
		case "Wednesday":
			System.out.println("Week day 3");
			break;
		case "Thursday":
			System.out.println("Week day 4");
			break;
		case "Friday":
			System.out.println("Week day 5");
			break;
		case "Saturday":
			System.out.println("Week day 6");
			break;
		default:
			System.out.println("End of week");
		}
	}

}
