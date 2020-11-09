package boletintema3;

import java.lang.Math;

public class Aleatorios7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int color;
		int color1=0;
		int color2=0;
		int color3=0;
		
		for (int i=0; i<3;i++) {
			color = (int)(Math.random()*6+1);
			if (color==color1 || color==color2 || color==color3) {
				i--;
			}
			else {
				System.out.print("Habitación " +(i+1) +": color ");
				
				switch (color) {
				case 1:
					System.out.println("rojo");
					break;
				case 2:
					System.out.println("azul");
					break;
				case 3:
					System.out.println("verde");
					break;
				case 4:
					System.out.println("amarillo");
					break;
				case 5:
					System.out.println("violeta");
					break;
				case 6:
					System.out.println("naranja");
					break;
				}
			}
			
			if (i==0) {
				color1 = color;
			}
			else if (i==1) {
				color2 = color;
			}
			else {
				color3 = color;
			}
		}
			
	}

}
