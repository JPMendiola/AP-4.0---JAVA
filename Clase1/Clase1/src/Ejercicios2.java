
public class Ejercicios2 {

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
