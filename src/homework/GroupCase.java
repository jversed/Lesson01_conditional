package homework;

public class GroupCase {
	public static String dayOfTheWeek(int d) {
		String day;
		switch(d) {
		case 1: day = "monday";break;
		case 2: day = "tuesday";break;
		case 3: day = "wednesady";break;
		case 4: day = "thursady";break;
		case 5: day = "friday";break;
		case 6: day = "saturday";break;
		case 7: day = "sunday";break;
		default: return "judgment day";
		}
		return day;
		}
	public static void main(String[] args) {
		
			int d=6;
			System.out.println(dayOfTheWeek(d));

	}

}
