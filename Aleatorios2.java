package boletintema3;

import java.lang.Math;
import java.util.Scanner;


public class Aleatorios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);
		int numero;
		int introd;
		int cont = 4;
		
		System.out.println("Generando un n�mero entre 0 y 100...");
		numero = (int)(Math.random()*100);
		
		System.out.println("Adivina el n�mero en el que estoy pensando:");
		for (int i=0; i < 5; i++) {
			introd = texto.nextInt();
			
			if (introd==numero) {
				System.out.println("�Felicidades! Has adivinado el n�mero en el que pensaba.");
				break;
			}
			else if (introd > numero) {
				System.out.println("�Incorrecto! El n�mero es menor a lo introducido.");
				System.out.println("Te quedan " +cont +" intentos.");
			}
			else if (introd < numero) {
				System.out.println("�Incorrecto! El n�mero es mayor a lo introducido.");
				System.out.println("Te quedan " +cont +" intentos.");
			}
			
			if (cont == 0) {
				System.out.println("�Has perdido! El n�mero era: " +numero);
			}
			
			cont--;
		}
	}

}
