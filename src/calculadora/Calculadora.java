package calculadora;
import java.util.*;

public class Calculadora {
	public static void main(String[] args) {
		int opcion; // guarda la opción del menú
		Scanner scanner = new Scanner(System.in); // Creo el objeto scanner antes del bucle
		scanner.useLocale(Locale.US);// Así me aseguro que tenga un formato standard a la hora de colocar los números
		do {
			System.out.println("============================");
			System.out.println("=====CALCULADORA BÁSICA=====");
			System.out.println("============================");
			System.out.println("	1.-Sumar	");
			System.out.println("	2.-Restar	");
			System.out.println("	3.-Multiplicar ");
			System.out.println("	4.-Dividir	");
			System.out.println("	5.-Salir	");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt(); // Aquí le voy a poder generar valores segun lo que solicite el usuario
			double primerValor = 0; // Creamos las variables para nuestros dos números.
			double segundoValor = 0;
				if (opcion >= 1 && opcion <= 4) {
					System.out.print("Introduce el primer número (usa punto, ej: 3.5): ");
					primerValor = scanner.nextDouble();
					System.out.print("Introduce el segundo número (usa punto, ej: 3.5): ");
					segundoValor = scanner.nextDouble();
				}
			switch (opcion) { // Usamos Switch en vez de if/elif/else y así podemos generar todos las diferentes operaciones algebraicas básicas
				case 1 -> System.out.println("Resultado: " + (primerValor + segundoValor)); 
				case 2 -> System.out.println("Resultado: " + (primerValor - segundoValor));
				case 3 -> System.out.println("Resultado: " + (primerValor * segundoValor));
				case 4 -> {
					if (segundoValor == 0) {
						System.out.println("No se puede dividir entre Cero");
					}else {
						System.out.println("Resultado: " + (primerValor / segundoValor));
					}
				}
				case 5 -> System.out.println("Hasta pronto! y gracias por usar la Calculadora Básica");
				default -> System.out.println("Opción no valida!");
				}
			}while (opcion != 5);
		scanner.close();
	}
}