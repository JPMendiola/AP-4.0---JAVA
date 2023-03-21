import java.util.Arrays;

public class Ejercicio1B {

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