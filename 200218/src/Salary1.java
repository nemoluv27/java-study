import java.util.Scanner;

public class Salary1 {
	public static void main(String[] args) {

		int x;
		int y;
		int cal;

		Scanner money = new Scanner(System.in);
		System.out.print("write your montly salary: ");
		x = money.nextInt();
		System.out.print("write the number of years you want to save:  ");
		y = money.nextInt();

		cal = x * 12 * y;

		System.out.println("your savings are :" + cal);

		money.close();

	}

}
