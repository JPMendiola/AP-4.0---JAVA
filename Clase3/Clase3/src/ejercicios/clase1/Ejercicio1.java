package ejercicios.clase1;

import java.util.Arrays;
public class Ejercicio1{

class Ejercicio1A {

	public static void main(String[] args) {
		//Palabra o frase a analizar
		String palabra = "Ornitorrinco";
		//Letra a contar en la palabra
		char letra = 'r';
		int posicion = 0;
			
		for( int i = 0; i<palabra.length(); i++){
			
			if (palabra.charAt(i) == letra) {
				posicion++;
				};
		}
		System.out.print("Se repite "+posicion+" veces.");
	}

}


class Ejercicio1B {

	public static void main(String[] args) {
		
		int [] numeros = {1, 2, 3};
		var orden = true;
		
		if(orden == true) {
			Arrays.sort(numeros);
		}
		
		for ( int num : numeros) {
		System.out.println(num);
		}
		
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] < numeros[j]) {  
					int temp = numeros[i];  
					numeros[i] = numeros[j];  
					numeros[j] = temp;  
				}  
			}  
		}
		for ( int num : numeros) {
			System.out.println(num);
			}
	}
}

class Ejercicio1C {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		int numero = 4;
		int sumatoria = 0;
		
		array[0]=1;
		array[1]=3;
		array[2]=5;
		array[3]=7;
		array[4]=16;
		
		for(int i=0 ; i<array.length; i++) {
			if(array[i] > numero) {
				sumatoria = sumatoria + array[i];
			};
		}		
		System.out.println(sumatoria);
	}

}
}
