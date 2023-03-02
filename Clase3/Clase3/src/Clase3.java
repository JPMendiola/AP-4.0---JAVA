
public class Clase3 {

	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		char letras[] = {'A','B','C'};
		
		numeros[0]=1;
		numeros[1]=3;
		numeros[2]=5;
		numeros[3]=7;
		numeros[4]=16;
				
		System.out.println("Largo"+" "+numeros.length);
		
		for(char i : letras) {
			System.out.println(i);
		}
	}

}
