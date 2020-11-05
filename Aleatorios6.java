package boletintema3;

import java.lang.Math;
import java.util.Scanner;

public class Aleatorios6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int dado;
		
        Scanner texto=new Scanner(System.in);

		System.out.println("Lanzar dos dados y comprobar si son iguales");
		System.out.println("Introduce el número de caras del dado:");
		dado = texto.nextInt();
		
		for (int i = 1; a!=b; i++) {
			a = (int)(Math.random()*dado)+1;
			b = (int)(Math.random()*dado)+1;
			
			System.out.println("Tirada " +i +": " +"a = " +a +"; b = " +b);
			if (a==b) {
				System.out.println("Los dados son iguales, saliendo...");
			}
		}
		
	}

}
