import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		Scanner mirror = new Scanner(System.in);

		int x;
		int y;
		int sum;
		int min;
		int mul;
		int div;

		System.out.print("input the first number: ");
		x = mirror.nextInt();

		System.out.print("input the second number: ");
		y = mirror.nextInt();

		sum = (x + y);
		min = (x - y);
		mul = (x * y);
		div = (x / y);

		System.out.println(x + "+" + y + "=" + sum);
		System.out.println(x + "+" + y + "=" + min);
		System.out.println(x + "+" + y + "=" + mul);
		System.out.println(x + "+" + y + "=" + div);
		
		mirror.close();
	}
}
