import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Principal amount");
		double principal=scan.nextDouble();
		System.out.println("Enter the rate of interest between 0 and 1");
		double rate=scan.nextDouble();
		if(rate<=1) {
			System.out.println("Enter the time in years");
			double time=scan.nextDouble();
			FinanceCalculator calculator = new FinanceCalculator();
			System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));
		}
		else {
			System.out.println("The  rate of interest should be less than 1");
		}
	}

}
