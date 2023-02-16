package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * M�todo de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * M�todo para mostrar por pantalla el vector pasado como par�metro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	
	public static void calculaSancion(double tasa) {
		
		
	
		 if (tasa <0.25) {
			System.out.printf("El conductor con tasa de alcolemia %.2f No tiene Sanción"+tasa);
		
		}else if(tasa>=0.25 ||tasa<0.50) {
			System.out.printf("El conductor con tasa de alcolemia %.2f tiene la sanción: 500€ y pérdida de 4 puntos"+tasa);
			
		}else if (tasa >=0.50||tasa<0.60) {
			System.out.printf("El conductor con tasa de alcolemia %.2f tiene la sanción: 1000€ y pérdida de 6 puntos"+tasa);
			
		}else {
			
		System.out.printf("El conductor con tasa de alcolemia %.2f tiene la sanción: Retirada del carnet y de 3 a 6 meses de cárcel"+tasa);
		}
			
	}
	
	public static int[] restaPuntos (int puntos[], int sanciones[]) throws VectoresDistintosException {
		int[] suma = null;

		
			if (puntos.length!=sanciones.length) {
				
				throw new VectoresDistintosException();
			}
			
				 suma=new int [suma.length];
				
				for (int i=0; i<puntos.length;i++);
				for (int j=0; j<sanciones.length;j++);
				
					suma[0]= puntos[0]+sanciones[0];
				
				return suma;
			
			}
			
			
		

	
		
		
	

}
