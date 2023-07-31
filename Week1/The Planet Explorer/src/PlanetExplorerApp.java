import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the planet in real number");
		double radius=scan.nextDouble();
		PlanetExplorer explorer=new PlanetExplorer();
		System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
	}

}
