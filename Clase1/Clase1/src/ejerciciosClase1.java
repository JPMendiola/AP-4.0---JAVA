class ejerciciosClase1 {
	
	public class Ejercicio1 {

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

	
	public class Ejercicio2 {

		public static void main(String[] args) {
			//Ingresos mensuales totales del hogar
			float ingresos = 1000000;
			//Tener 3 o más vehículos con una antigüedad menor a 5 años.
			int vehiculosMenosCincoAnios = 0;
			//Tener 3 o más inmuebles.
			int inmuebles = 0;
			//Poseer una embarcación, una aeronave de lujo o ser titular de activos
			boolean embarcacionAeronaveTitulos = false;
		
			if ((ingresos>=572386)||(vehiculosMenosCincoAnios>=3)||(inmuebles>=3)||(embarcacionAeronaveTitulos==true)) {
			System.out.println("Pertenece a Ingresos Altos");
			};
		
		}

	}
}
