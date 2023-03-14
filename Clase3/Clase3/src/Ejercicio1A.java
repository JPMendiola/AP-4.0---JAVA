
public class Ejercicio1A {

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
