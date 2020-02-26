import java.util.Scanner;

public class Circlearea {
	public static void main(String[] args) {


		double x;
		final double PIE=3.14;
		double cal;
		
		
		Scanner radius = new Scanner(System.in);
		System.out.print("radius: ");
		x = radius.nextDouble();
		
		cal = PIE*x*x;

		System.out.println("The area of this circle :" + cal);

		radius.close();

		
		
		
	}
}
