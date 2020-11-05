package boletintema3;

import java.lang.Math;

public class Aleatorios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numnota;
		String nota;
		
		int suspensos = 0;
		int suficientes = 0;
		int bien = 0;
		int notables = 0;
		int sobresalientes = 0;
		
		System.out.println("Generando 20 notas al azar...");

		for (int i = 0; i<20; i++) {
			numnota = (int)(Math.random()*5);
			
			switch(numnota) {
			case 0:
				nota = "Suspenso";
				suspensos++;
				break;
			case 1:
				nota = "Suficiente";
				suficientes++;
				break;
			case 2:
				nota = "Bien";
				bien++;
				break;
			case 3:
				nota = "Notable";
				notables++;
				break;
			case 4:
				nota = "Sobresaliente";
				sobresalientes++;
				break;
			default:
				nota = " ";
				break;
			}
			System.out.println(i+1 +".- " +nota);
			
		}
		System.out.println("Ha habido " +suspensos +" suspensos.");
		System.out.println("Ha habido " +suficientes +" suficientes.");
		System.out.println("Ha habido " +bien +" bien.");
		System.out.println("Ha habido " +notables +" notables.");
		System.out.println("Ha habido " +sobresalientes +" sobresalientes.");
	}

}
