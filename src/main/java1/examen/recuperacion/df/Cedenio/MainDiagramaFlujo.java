package examen.recuperacion.df.Cedenio;

import java.util.*;

public class MainDiagramaFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		Scanner lector=new Scanner(System.in);
		do { System.out.println("Programa de figuras:\n1.Triangulo\n2.SALIR");
		menu= lector.nextInt();
		System.out.println("Ingrese dimension");
			int d = lector.nextInt();
			for (int i = 1; i <= d; i++) {
				for (int j = d; j >= i; j--) {

					System.out.print("*");

				}
				System.out.println("");
			}
		} while (menu != 2);

	}
}
