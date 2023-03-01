
public class Ejercicios1 {

	public static void main(String[] args) {
		//Rango definido
		int nInicio = 5;
		int nFin = 14;
		//Acá se define si se muestran los pares o impares
		boolean var = true;
		
		//Assignment "a/b/c"
		System.out.println("Respuesta"+" "+"(1)"+"A/B/C");
		while(nInicio<=nFin) {
			if (nInicio%2==0 && var==true) {
				System.out.println(nInicio+" ");				
			}
			if (nInicio%2!=0 && var==false) {
				System.out.println(nInicio+" ");				
			}
			nInicio++;
		}	
		
		int nInicio2 = 15;
		int nFin2 = 24;
		
		//Assignment "d"
		System.out.println("Respuesta"+" "+"(1)"+"D");

		for(int i=nFin2;i>=nInicio2;i--){
			if(i%2==0) {
			System.out.println(i+"");
			}
		}

	}
	

}
