package boletintema3;

import java.lang.Math;

public class Aleatorios5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int caracter;
		char car;
		
		for (int i = 0; i<100; i++) {
			for (int k = 0; k<50; k++) {
				caracter = (int)(Math.random()*94)+32;
				car = (char)caracter;
				System.out.print(car);
			}
			System.out.println(" ");
		}
	}
}
