import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner mirror = new Scanner(System.in); 
		
		int x; 
		int y; 
		int sum; 
		
		System.out.print("input the first number : ");
		x = mirror.nextInt(); 
		
		System.out.print("input the second number : ");
		y = mirror.nextInt();
		
		sum = (x + y);

		System.out.println("sum: "+sum); 
		
		mirror.close();
		
	}
}
