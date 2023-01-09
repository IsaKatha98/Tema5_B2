package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		//Declaramos las variable.
		int longitud;//Variable longitud del array.
		int posiciones;
		int [] numeros;//Noombre de la tabla.
				
		
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
