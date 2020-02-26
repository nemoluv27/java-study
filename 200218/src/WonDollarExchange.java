import java.util.Scanner;

public class WonDollarExchange {
	public static void main(String[] args) {

		int won;
		double exchange;
		final double DOLLAR = 1392.83;

		Scanner cal = new Scanner(System.in);
		System.out.print("input Won: ");
		won = cal.nextInt();

		exchange = won / DOLLAR;
		System.out.println(exchange);
		cal.close();

	}
}
