
public class Ejercicio1C {

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
