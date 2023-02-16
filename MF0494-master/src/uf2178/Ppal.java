/**
 * 
 */
package uf2178;

import java.util.Scanner;

import uf2181.FuncionesDGT;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int puntos[];
		int sanciones[];
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("PROGRAMA PARA CALCULAR SANCIONES");
		System.out.println("Introduzca la tasa de alcoholemia:");
		double tasa= teclado.nextDouble();
		//Funciones.calculaSancion(tasa);
		
		System.out.println("Introduce a los puntos: ");
		puntos=new int [6];
		Funciones.pedir_vector(puntos);
		
		System.out.println("Introduce a las sanciones: ");
		sanciones=new int [6];
		Funciones.pedir_vector(sanciones);
		
		System.out.println("El resultado sería: ");
		try {
			Funciones.restaPuntos(puntos, sanciones);
			Funciones.mostrar_vector(sanciones);
		} catch (VectoresDistintosException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
