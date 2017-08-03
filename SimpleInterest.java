import java.util.Scanner;

public class SimpleInterest {
	double princple = 0;
	float rate = 0;
	int time = 0;
	double amount = 0;
	double si = 0;

	SimpleInterest(double p, float r, int t) {
		princple = p;
		rate = r;
		time = t;
	}

	private double calculateInterest() {
		si = (princple * rate * time) / 100;
		return si;
	}

	public static void main(String[] args) {
		// var declaration
		double si = 0;
		double princple = 0;
		float rate = 0;
		int time = 0;
		// read inputs
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the principle amount:");
		princple = scanner.nextDouble();
		System.out.print("Enter the rate:");
		rate = scanner.nextFloat();
		System.out.print("Enter the time:");
		time = scanner.nextInt();
		// create object
		SimpleInterest am = new SimpleInterest(princple, rate, time);
		si = am.calculateInterest();
		System.out.println("Interest = "+si);
	}

}
