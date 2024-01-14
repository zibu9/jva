import java.util.Scanner;

/**
 * segond_degre
 */
public class segond_degre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("Entrer le a");
		a = sc.nextDouble();
		sc.nextLine();
		System.out.println("Entrer le b");
		b = sc.nextDouble();
		sc.nextLine();
		System.out.println("Entrer le c");
		c = sc.nextDouble();
		sc.nextLine();
		delta = delta(a, b, c);
		double racine = Math.sqrt(delta);
		System.out.println("delta vaut: " + delta);
		System.out.println("sa racine vaut: " + racine);
		if (delta < 0) {
			System.out.println("cette equation n'admet de racines dans R");
		} else if (delta == 0) {
			x1 = x2 = ((0 - b) / (2 * a));
			System.out.println("x1 vaut" + x1);
			System.out.println("x2 vaut" + x2);
			System.out.println("S={" + x1 + "," + x2 + "}");
		} else {
			x1 = ((0 - b - racine) / (2 * a));
			x2 = ((0 - b + racine) / (2 * a));
			System.out.println("x1 vaut: " + x1);
			System.out.println("x2 vaut: " + x2);
			System.out.println("S={" + x1 + "," + x2 + "}");
		}

	}

	public static double delta(double a, double b, double c) {
		return (double) ((int) Math.pow(b, 2) - (4 * a * c));
	}
}