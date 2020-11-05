package boletintema3;

import java.lang.Math;

public class Aleatorios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int longitud;
		int caracter;
		String car;
		
		System.out.println("Generando 10 líneas de longitud aleatoria de carácteres aleatorios...");
		
		for (int i = 0; i<10; i++) {
			caracter = (int)(Math.random()*6);
			
			switch(caracter) {
			case 0:
				car = "*";
				break;
			case 1:
				car = "-";
				break;
			case 2:
				car = "=";
				break;
			case 3:
				car = ".";
				break;
			case 4:
				car = "|";
				break;
			case 5:
				car = "@";
				break;
			default:
				car = " ";
				break;
			}
			
			longitud = (int)(Math.random()*40)+1;
			
			for (int k = 0; k<longitud; k++) {
				System.out.print(car);
			}
			System.out.println(" ");
		}
	}

}
