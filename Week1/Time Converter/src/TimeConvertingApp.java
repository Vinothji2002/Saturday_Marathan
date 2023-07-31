import java.util.Scanner;
public class TimeConvertingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the time in minutes");
		int minute=scan.nextInt();
		System.out.println(convertToHours(minute));
	}
	public static double convertToHours(int minutes) {
		return minutes/60.0;
	}

}
