package gasolinera;

import java.util.Scanner;

public class gasolinera {
	public static void main(String[] args) {
		boolean salir = false;
		while (!salir) {
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("1. MAGNA 21.9");
			System.out.println("2. PREMIUM 24.4");
			System.out.println("3. SALIR");
			Scanner Numero = new Scanner(System.in);
			int opcion = Numero.nextInt();
			switch (opcion) {
			case 1:
				venta(21.9);
				break;
			case 2:
				venta(24.4);
				break;
			case 3:
				System.err.println("Gracias por usar la gasolinera");
				salir = true;
				break;
			}
		}
	}

	public static void venta(double precio) {
		double totalcompra;
		System.out.println("Como vas a comprar");
		System.out.println("1. Litros");
		System.out.println("2. Pesos");
		Scanner Numero = new Scanner(System.in);
		int lp = Numero.nextInt();
		switch (lp) {
		case 1:
			System.out.println("El costo por litro es " + precio + "¿Cuántovasacomprar?");
			Scanner num = new Scanner(System.in);
			double compra = Numero.nextInt();
			totalcompra = (compra * precio);
			System.out.println("TusLitrosfueron:" + compra);
			System.out.println("Pagar:" + totalcompra);
			break;
		case 2:
			System.out.println("El costo por litro es $" + precio + " ¿Cuánto vas a comprar?");
			Scanner num2 = new Scanner(System.in);
			int compra2 = Numero.nextInt();
			totalcompra = (compra2 / precio);
			System.out.println("Pagas: " + compra2);
			System.out.println("Tus litros fueron: " + totalcompra);
			break;
		}
	}
}
