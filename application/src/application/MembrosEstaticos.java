package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembrosEstaticos {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o Raio");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunferencia(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor do PI: %.2f%n", Calculator.PI);
		
		sc.close();

	}

}
