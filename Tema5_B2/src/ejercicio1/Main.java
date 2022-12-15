package ejercicio1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Declaramos las variable.
		int longitud;//Variable longitud del array.
		int posiciones;
		int [] numeros;
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
		
		//Pedimos los datos y hacemos el bucle for correspondiente.					
		System.out.print("Introduzca un número y pulse Intro: ");
		longitud=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		posiciones=sc.nextInt();
		
		numeros= new int [longitud];
		
		//Hacemos el array.
		Arrays.fill (numeros, posiciones);
		
		//Imprimimos la tabla.
		System.out.println(Arrays.toString(numeros));

	}
	
	
		
	

}
