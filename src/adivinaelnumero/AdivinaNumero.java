package adivinaelnumero;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroSistema = (int) (Math.random() * (101 - 1) + 1); // Con esta variable, generamos un número random que va desde 1 a 100, sin incluir el 0
		int intento = 0; //iniciamos dos variables, una para guardar el número del usuario, y otro para contar los intentos de adivinar.
		int intentos = 0; // los dejamos fuera del Do-While para que se mantengan los datos y no se reinicie con el bucle.

		System.out.println("=====================");
		System.out.println("==ADIVINA EL NÚMERO==");
		System.out.println("=====================");
		do { //Usamos un Do-While para que se repita este proceso n cantidad de veces
			intentos++;
			System.out.print("Adivina un número del 1 al 100 (teclea 0 para rendirte):  ");
			intento = scanner.nextInt();

			if (intento == 0) { // hacemos un if/elseif/else para ayudar al usuario a llegar al número que se genero al azar por el juego.
				System.out.println("¡Te veo en otro juego! El número era " + numeroSistema);
			} else if (intento < numeroSistema) {
				System.out.println("Demasiado Bajo!");
			} else if (intento > numeroSistema) {
				System.out.println("Demasiado alto!");
			} else {
				System.out.println(
						"Correcto! El número era " + numeroSistema + " ,el número de intentos fue " + intentos);
			}
		} while (intento != 0 && intento != numeroSistema); // Gracias a esta declaración el programa se detiene si el intento es distinto a 0 y no es igual al del sistema.
		scanner.close();
	}

}