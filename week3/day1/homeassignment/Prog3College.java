package week3.day1.homeassignment;

public class Prog3College extends Prog3Department{
	
	public static void main(String[] args) {
		
		Prog3College prog3college = new Prog3College();
		prog3college.getStudentInfo(123);
		prog3college.getStudentInfo(123, "Kalidas");
		prog3college.getStudentInfo(123, "Kalidas", "test@test.com", "12345678");
	}

}
