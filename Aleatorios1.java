package boletintema3;

import java.lang.Math;

public class Aleatorios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int maximo = 100;
		int minimo = 199;
		int suma = 0;
		int media;
		int contador = 0;
		
		System.out.println("50 números aleatorios, del 100 al 199: ");
		
		for (int i=0; i<50; i++) {
			numero = (int)(Math.random()*100)+100;
			System.out.print(numero +" ");
			
			if (numero > maximo) {
				maximo = numero;
			}
			if (numero < minimo) {
				minimo = numero;
			}
			suma = suma + numero;
			contador++;
		}
		System.out.println(" ");
		
		media = suma/contador;
		
		System.out.println("El máximo es: " +maximo);
		System.out.println("El minimmo es: " +minimo);
		System.out.println("La media es: " +media);
	}

}
