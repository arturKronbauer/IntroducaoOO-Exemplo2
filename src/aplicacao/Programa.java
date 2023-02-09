package aplicacao;

import java.util.Scanner;

public class Programa {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		double c = circumference(raio);
		double v = volume(raio);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", PI);
		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
