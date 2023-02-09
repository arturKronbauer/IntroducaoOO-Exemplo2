package aplicacao;

import java.util.Scanner;

import util.Calculadora;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		Calculadora calc = new Calculadora();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", calc.PI);
		sc.close();
	}
}
